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

- Typescript has all the same datatypes as JS plus a few more.
    - "any" - because TS is a superset of JS it has to be able to handle untyped variables. TS achieves this with "any" type, allow any datatype be stored there.
    - Arrays - Arrays in TS are typed like in Java where they only accept one type of value.
    - TS does have enums like Java.
    - never and void. These are function return types:
        - void is the same as Java. The function returns nothing. 
        - never is used in a function that "raises" (throws) an error. It means that function will never complete because the error will traverse the stack instead.
    - TS being strongly typed, the type of a variable and the return type of function need to be declared. Syntactically this looks like so:
        - `let myString:string = "this is my string in TS";`
        - `let fruits:string[] = ["apple", 'banana'];`
        - `let fruits:Array<string> = ["apple", 'banana'];`
        - `function myFunc(a:string):void {console.log(a);}`

## TS Classes

- TS has greater support for OOP principles than raw JS. However, the syntax is very similar when creating classes.
- TS adds the extends keyword that functions like it does in Java for inheritance.
- Access Modifiers:
    - public: this is the default modifier. Same as Java in that the field/function is available everywhere.
    - protected: visible only to the class and the subclass.
    - private: only visible to the class itself.
- ReadOnly: this marks the class's property as unchangeable. It must initialize the field at declaration or in the constructor.
- There are also built-in supports for getters and setters with the "get" and "set" keywords.

## Single Page Applications (SPAs)

- A single page application is a web application that fits into a single HTML page in the browser. All the HTML, CSS, and JS are retrieved by the browser with a page load for the entire site. 
Navigation between what appears to be seperate pages of the website is in fact, DOM manipulation instead of new page loads.
- Examples: Gmail, Twitter, Trello etc.
- Benefits:
    - Fast and responsive. Since it only downloads once and the JS in continuously running without having to reload the actions on the page can be done very quickly.
    - Shared elements or duplicate elements only are loaded once instead of having to be re-rendered each time a page loads.
    - High Caching capabilities. Generally when you move between pages, the JS stopping removes all information that script had in memory, but if you never change pages, your single JS process can share information (cache information) for different views to use.
- Disadvantages:
    - SPAs do not perform well with Search Engine Optimization.
    - Security - SPAs are more vulnerable than traditional webpages to XSS (Cross Site Scripting) attacks. [OWAPS XSS](https://owasp.org/www-community/attacks/xss/)
    - While the overall performance is better in an SPA generally, since all the data is front loaded, an SPA can take longer than a traditional site to load initially.

# Angular File Structure

- `src`: Contains the source code files that you are writing as the developer. This will include your components, modules, and services.
    - `app`: This folder generally houses all the custom files for your source code. It defines what is in your application. It is initialized with a root componenet that will contain all your other components generally.
        - `app.component.ts`: TypeScript file for the root component.
        - `app.component.css`: Root component's CSS file.
        - `app.component.html`: Root component's HTML snippet/template.
        - `app.component.spec.ts`: Autogenerated Jasmine testing file for the root component.
        - `app.module.ts`: Defines the base module for the application.
        - `app-routing.module.ts`: This allows for SPA routing.
    - `assets`: This is images or other static resources.
    - `environments`: Contains build configuration options for different environments you may want to deploy to.
    - `favicon`: Image displayed on the browser tab.
    - `index.html`: Base HTML page that all components will be added and removed from.
    - `main.ts`: This is the entry point for building the project. Usually should be left alone.
    - `test.ts`: This is the entry point for testing frameworks.
    - `styles.css`: This is the "global" style sheet for styling the application as a whole. This is linked in the index.html so it applies to everything.
- `angular.json`: This holds the CLI configuration details for the project. It includes options for building and testing the project.
- `karma.conf.js`: Configuration for Karma framework to run Jasmine tests.
- `node_modules`: This is a folder where npm will place all dependencies for the Angular project. NOTE: It is important to not commit the node_modules to the repository as it is redundant and can lead to merge conflicts when dependencies are updated.
    - `package.json` and `package-lock.json`: These are the files that define the dependencies that will be managed in the node_modules folder.

The `package.json` has more high-level information about dependencies and then details are defined in the `package-lock.json`.

## Angular Components

- Components in Angular are essentially pieces of a webpage that can be displayed or removed by the application when necessary.
- The CLI will generate components for you with all the required files and list it in the base module. This, however, is a convenience feature and can be done manually.
- Components are made up of usually 4 files: html, css, ts, and spec.ts (optional).
- Components are given their unique functionality in the framework with the `@Component` decorator.
    - A decorator is basically the same as an annotation in Java.
    - The `@Component` is placed on a class and will define 3 values:
        - The name of the component to be used elsewhere in the application with the "selector" field.
        - `styleUrls` will define the component's stylesheet. 
        - `templateUrls` will define the HTML for the component.
        - `styleUrls` and `templateUrl` can be replaced with fields that take raw CSS and HTML respectively instead of using external files, but in Angular, this is considered poor practice. 
- Components are TS classes which means they have a constructor, fields variables, and methods/functions. The class needs to be exported so it can be combined with the rest of the application.
- Components can be added to the page by creating an HTML tag with the component's name as defined by the selector for the tag name. 

## Data Binding