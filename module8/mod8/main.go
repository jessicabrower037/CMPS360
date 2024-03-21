package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
)

func main() {
	http.HandleFunc("/", fileHandler)
	fmt.Println("Server is listening on port 3000...")
	http.ListenAndServe(":3000", nil)
}

func fileHandler(w http.ResponseWriter, r *http.Request) {
	filePath := "albums.txt"
	content, err := ioutil.ReadFile(filePath)
	if err != nil {
		http.Error(w, fmt.Sprintf("Failed to read file: %v", err), http.StatusInternalServerError)
		return
	}

	w.Header().Set("Content-Type", "text/plain")
	w.Write(content)
}
