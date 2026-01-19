# Node JS

- A JavaScript runtime environment that is seperate from a browser.
- It is open source, cross-platform, and provides a large library of various JS modules which can simplify development.
- NodeJS is used by many industry leaders for server-side JS development including Neflix, Facebook, Walmart, Linkedin etc.

## Node Package Manager (NPM)

- This is a Node's built-in package manager. It is similar to things like scoop, chocolate, homebrew, or yum.
- Angular is installed by NPM which is built in a Node environment. Other libraries and frameworks that Angular uses can also be installed with NPM.
- CLI for NPM start with "npm".

## Angular

- A framework desgined by **Google**. It can be used to create reactive webpages, generally single page applications (SPA). 
- Angular is composed of three fundemental parts: **Modules**, **Components**, and **Services**. It contains support for directives, data binding, and dependency injection. 
    - Components are "sections" of a web page that are easily added or removed from the DOM. Components can be nested inside other components easily.
    - Services are pure logic files written in Typescript. They hold functions, variables, and classes that are generally shared across components.
    - Modules are collections of components, services, and other modules that organize the application. 
- Angular has a CLI that used "ng" for its commands.

## Typescript (TS)

- A superset of JavaScript
    - All valid JS is valid TS. (Everything that JS can do, TS must be able to do as well.) The reverse however is not true.
- TS is an open-source, object oriented, portable and strongly typed language. 
    - OOP - it supports classes, inheritence, interfaces, access modifiers etc.
    - TS files traditionally have ".ts" as their file extensions.
- Browsers are designed to run JS. They do not know what TS is. Thus, TS needs the be "transpiled" into JS in order to be run by most environments.
    - The term transpiled is used to indicate that you are converting between two programming languages that are considered to be at the same level. I.e. both TS and JS are high level programming languages so converting between them is called transpiling. Traditionally this is opposed to compiling which is going from a high level language to a lower level language.

## Typescript datatypes
