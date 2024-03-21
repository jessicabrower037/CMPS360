package main

import "fmt"

func main() {
	const concertTickets int 50
	var remainingTickets int 50
	concertName = "Go Concert"
	bookings := []string{}

	fmt.Println("Welcome to " + concertName + "booking application. \nWe have a total of %v still available. \nPurchase tickets?")}
	
	//declare data types
	var firstName string
	var lastName string
	var email string
	var userTickets uint

	//collect user data
	fmt.Println("Enter your first name: ")
	fmt.Scanln(&firstName)

	fmt.Println("Enter your last name: ")
	fmt.Scanln(&lastName)

	fmt.Println("Enter the number of ticketz: ")
	fmt.Scanln(&concertTickets)

	//logic for booking system
	remainingTickets = remainingTickets - userTickets
	bookings = append(bookings, firstName + " " lastName)

	//output
	fmt.Printf("Thanks %v %V for booking %v tickets. You will recieve a confirmation email at %v\n"
lastName, userTickets, email)

fmt.Printf("%v tickets remaining for %v\n", remainingTickets, conferenceName)
fmt.Printf("These are all of our bookings: %v\n" , bookings)