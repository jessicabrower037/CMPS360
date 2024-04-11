import requests
from bs4 import BeautifulSoup
import json

def scrape_indeed():
    url = 'https://www.indeed.com/'
    response = requests.get(url)
    if response.status_code == 200:
        soup = BeautifulSoup(response.content, 'html.parser')
        jobs = []
        job_elements = soup.find_all('div', class_='jobsearch-SerpJobCard')
        for job_elem in job_elements:
            title_elem = job_elem.find('h2', class_='title')
            company_elem = job_elem.find('span', class_='company')
            location_elem = job_elem.find('div', class_='location')
            
            if None in (title_elem, company_elem, location_elem):
                continue
            
            job = {
                'title': title_elem.text.strip(),
                'company': company_elem.text.strip(),
                'location': location_elem.text.strip()
            }
            jobs.append(job)
        
        return jobs
    else:
        print("Failed to fetch page")
        return []

def save_to_json(data, filename):
    with open(filename, 'w') as f:
        json.dump(data, f, indent=4)

if __name__ == "__main__":
    jobs = scrape_indeed()
    save_to_json(jobs, 'indeed_jobs.json')

