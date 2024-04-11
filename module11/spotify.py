import requests
import json

def scrape_spotify():
    url = 'https://api.spotify.com/v1/browse/new-releases'
    headers = {
        'Authorization': 'Bearer 01655ebaaf954d04ab001c4652459b41'
        # Replace with your own access token
    }
    response = requests.get(url, headers=headers)
    if response.status_code == 200:
        data = response.json()
        albums = []
        for album in data['albums']['items']:
            album_info = {
                'name': album['name'],
                'artists': [artist['name'] for artist in album['artists']],
                'release_date': album['release_date'],
                'total_tracks': album['total_tracks']
            }
            albums.append(album_info)
        return albums
    else:
        print("Failed to fetch data from Spotify API")
        return []

def save_to_json(data, filename):
    with open(filename, 'w') as f:
        json.dump(data, f, indent=4)

if __name__ == "__main__":
    spotify_data = scrape_spotify()
    save_to_json(spotify_data, 'spotify_new_releases.json')
    print("Data saved to spotify_new_releases.json")
