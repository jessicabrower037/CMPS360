package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)

	fmt.Println("Hi! Can I ask you some questions?")
	fmt.Print("What's your name? ")
	name, _ := reader.ReadString('\n')
	name = strings.TrimSpace(name)

	fmt.Printf("Nice to meet you, %s!\n", name)
	fmt.Print("How old are you? ")
	age, _ := reader.ReadString('\n')
	age = strings.TrimSpace(age)

	fmt.Printf("You're %s years old? Cool!\n", age)
	fmt.Print("What are your career aspirations?")
	color, _ := reader.ReadString('\n')
	color = strings.TrimSpace(color)

	fmt.Printf("Nice, I hope you find success!")
}
