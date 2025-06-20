# Extensions (HTML)
- Live Server (let's us right click an HTML file and open quickly "open with live server")

# What is HTML?
* HyperText Markup Language (HTML) is used to create web pages (front end!)
    - A markup language (HTML, XML, etc) is descriptive not programmatic. In Engligh, HTML is not a programming language, but a markup language!
    - Hypertext refers to the ability of HTML to easily "link" to other pages.
        - It's the face, not the brain. It creates what a web page look like (along with CSS), whereas JavaScript is what actually gives web pages functionality.
    - HTML is the standard for displaying web pages on the internet.
    - HTML syntax is broken down into two subsets: elements and attributes.

# Syntax 1: HTML Elements
- Elements provide the structure of the document and are defines by tags.
    - Eg. `<div> this is a div element, surrounded by the div tag </div>`
- HTML must have the tags properly nested in order to be valid.
    - Correct: `<div> <p> </p> </div>`
    - Incorrect: `<div> <p> </div> </p>`
- There are two categories/types of elements:
    - Block Elements: These elements will render as a block on the page, meaning any following element will render on a new line by default. Basically, block elements take up an entire line for themselves. In other words, it blocks a line for itself.
    - Inline Elements: These elements can sit next to each other on the same line when rendered. Can be rendered in the same line as each other.