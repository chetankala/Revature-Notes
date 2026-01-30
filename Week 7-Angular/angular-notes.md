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

- In Angular, data binding provides for the communication between a component's HTML and values in the TS file.
- It is a technique used to bind the data from the TS class to the HTML template that is then updated on the DOM and vice versa. This is not a concept that is unique to Angular, but Angular provides significant support for it compared to other frameworks/libraries.
- One-way data binding allows us to manipulate the views through our models if we make changes to the values in our TS classes, generally at runtime.
    - String interpolation (often just as referred to as interpolation) - This displays the value of  component's variable as text on the HTML document. Syntactically it uses double curly brces in the HTML.
        - E.g. `<p>{{myVar}}</p>`
        - `let myVar:string = "hello world"`
        - Renders a paragraph element on the HTML with the value hello world. 
    - Property binding - This binds the value of a component's variable to the attribute of an HTML element. When the value changes so does the attribute. This uses brackets around the attribute name.
        - `<tag [attribute-name]="var-name">value</tag>`
        - E.g. `<img [src]="image">` // Whatever URL is contained in the TS variable image is what this image tag will display.
    - Event binding - Allows you to bind DOM events such as button clicks or mouseovers to a function. Essentially this sets up event listeners for you and uses parentheses around the event in the opening tag for syntax. 
        - `<tag (event)="function"></tag>`
        - E.g. `<button (click)="myFunc()"/>`
- Two-way data binding:
    - This combines property binding with event binding to allow information to flow between the HTML document to the script and back. It is particularly useful in gathering user inputs in things like forms. Note that the functionality is contained in the FormsModule of Angular.
    - Two-way binding will trigger on the event of user input into an input field and update the value attribute along with the variable that is bound in the component class. This uses the `ngModel` directive inside parentheses inside brackets.
        - `<input [(ngModel)]="var-name"/>`
        - E.g. `<input type="text" [(ngModel)]="myVar"/>`

## Angular Model

- Modules are classes in Angular that are designed to organize related parts of our project together, allowing for modularization. They use the `@NgModule` decorator above the class.
- Dependencies for our Angular application will also often be Modules such as the FormsModule or the HTTPClientModule.
- Ultimately, the module can be thought of ensuring that all necessary parts of the application such as components, services, and other modules are bundled together so that they can see each other and the application as a whole can access them.
- `NgModule` decorator has 4 fields that it sets:
    - `Declarations`: This is where components are included in the module.
    - `Imports`: This is where other modules are included.
    - `Providers`: This is where services are included. Services created in the app folder for a base project be already visible so are required to be included in a module, but if you want to restrict them to a particular module or you want to export them within a module then it must be included as a provider.
    - `Bootstrap`: This defines the "root" component of the module. Essentially, which component needs to be loaded first to load the others. (This has nothing to do with Bootstrap the CSS framework.)
- The CLI will automatically include new components it generates in the base module, so you don't have to. However, if you manually create components, you will need to add them to the module as well.

# Angular Directives

- Directives are markers in the HTML templates of Angular Components. They provide functionality for DOM manipulation.
- Angular will see the directives when building and insert the necessary logic to fulfill them.
- Directives can change appearance, behavior, layout, etc. of the elements and their children. Generally, they begin with "ng".

## 3 Types of Directives:

1. **Component Directive**: Components in Angular are considered directives as well. All components automatically use the component directive to be added onto the HTML page.
2. **Structural Directives**: These change the structure of the HTML page. They will actually add or remove elements from the page. They are identified with a "*" before the "ng".
    - Example: `*ngIf`, `ngFor`
3. **Attribute Directives**: Used to change or alter existing elements on the page via their attributes.
    - Example: `ngModel`, `ngStyle`, `ngClass`

## Built-in Directives:

- `*ngIf`: Adds or removes an element based on a boolean expression.
- `*ngFor`: Iterates over an array to create elements for each value in that array.
- `ngClass`: Used to change/define the class of an HTML element. The variable assigned can have 3 different types:
    - String: The classes are declared with a string, the same way you would declare classes for an element in HTML.
    - String Array: The classes are defined as individual strings in the array, and the directive will combine them to make the attribute string. 
    - Object: Each key in the object is a possible class, and the value is a boolean indicating if that class is active. 
- `ngStyle`: Used to change the style attribute of an element based on a variable or expression. 
- `ngModel`: Attribute directive used in the FormsModule for two-way binding.
- `ngSwitch`: Used for switch case functionality in the HTML template.

## Custom Directives
- Custom Directives can be created with the CLI using the command `ng generate directive <location/name>`.

# Pipes

- Pipes provide ways to transform values in Angular. Pipes use the "`|`" character and can take various inputs to return refactored values.
- Built-in pipes include Date, Decimal, Currency, Percent, Slice, Lowercase/Uppercase, Titlecase, Json.
- Async pipes handle transformation asynchronously with promises or observables.
- You can create your own custom pipes using the `@Pipe` decorator and generating them with the CLI.

# Services

- Services are used to organize and share business logic. They hold models, functions, data used across multiple components.
- An Angular Service is a singleton instance that can be dependency injected into multiple components. This makes code highly reusable.
- Components should use dependency injection to access the services they require.
- Services are identified with the `@Injectable` decorator.

## Routing

- In an SPA, all the information is frontloaded with an initial request/response that downloads the page and the attached CSS/JS files. However, we can mimic the experience of browsing multiple pages with routing. Routes allow for navigation initially to a displayed component via URL and the ability to "swap" one component with another through internal links.
- Routing requires the `RoutingModule` in Angular. It can be included in the initial project setup with a `--routing` flag.
- Once routing is set up, you define various URL paths in your application that leads to a specific components being displayed by configuring the `app-routing.module.ts` file.
- The `<router-outlet>` element defines where the component that is being routed to will appear.
- The `RoutingModule` includes "route guards" functionality to deny users based on authorization access to certain routes.
- To include routing with internal links, you use `routerLinks`.
    - An anchor tag will need the attribute `routerLinkActive` to be set to active in order to change the functionality of the anchor to route instead of sending a GET request through the browser. Then the `routerLink` attribute is set the URL path that indicates the specific component to render.

## Webpack

- In a web application when we might want to use many JS files for a single HTML page it makes more sense to combine these files they are retrieved with a single (or just a few) requests instead of having to request each file from its location individually. 
- Module bundlers are utility tools used to combine or bundle several JS files into a single file. Angular uses Webpack which is a Module bundler "under the hood" when building or serving your application to do this.
- Webpack is a static module bundler for JS. It does not work with TS, so the Angular TS files must first be transpiled (with the tsc transpiler) to JS for Webpack to bundle.

# Design Patterns in Angular

- Design patterns are reusable solutions to common architectural and structural challenges that developers encounter when building applications.
- These patterns provide established and proven ways to organize code, handle communication between components, manage state, optimize performance, and ensure maintainability and scalability of Angular applications.

**Dependency Injection (DI):**

- DI is a design pattern where an object recieves its dependencies (other objects that contain functions/methods/data, etc.) from the framework instead of the developer hard coding in the objects directly.
- DI does not ever use the "new" keyword.
- Angular uses constructor injection for its DI strategy. Injectable objects are listed in the constructor's parameters, and Angular uses the private access modifier to manage dependencies.
- DI is not unique to Angular and other injection strategies like setter injection, field injection, and interface injection exist, but Angular does not support these.

**Angular DI Example:**

Let's say you have a service named `UserService` that handles user-related operations. You want to inject this service into a component called `UserComponent`.

- **UserService:**

    ```typescript
    import { Injectable } from `@angular/core`;
    
     @Injectable()
     export class UserService {
        getUsers(){
            // Logic to fetch users from a data source
        }
     }
    ```

- **UserComponent:**

    ```typescript
    import {Component} from '@angular/core';
    import {UserService} from './user.service';

    @Component({
        selector: 'app-user',
        template: '<h1>Users List</h1>'
    })
    export class UserComponent {
        constructor(private userService: UserService) {
            const users = this.userService.getUsers();
            // Do something with the users
        }
    }
    ```

In this example, the `UserService` is injected into the `UserComponent` through constructor injection. Angular manages the instantiation of the `UserService` and provides it to the component.

---

**Spring Controller DI Example:**

Let's assume you have a Spring Boot application with a controller that handles REST endpoints related to users. You want to inject a service named `UserService` into the controller.

- **UserService:**

```java
@Service
public class UserService {
    public List<User> getUsers() {
        // Logic to retrieve users from a db
    }
}
```

- **UserController:**

```java
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    //@Autowired is an annotation used to automatically inject dependencies into a Spring bean. It simplifies the process of connecting different components of an application by letting the Spring container handle the creation and injection of necessary objects.
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
```

- In this Spring example, the `UserService` is injected into the `UserController` through constructor injection. Spring manages the instantiation of the `UserService` and provides it to the controller.

- Both Angular and Spring use dependency injection to manage the relationships between components, services, and other classes, making the code more modular, testable, and maintainable.

- They ensure efficiency by using the singleton design pattern.

## Lifestyle Hooks:

- Lifecycle Hooks are functions inherited by Component classes that trigger at certain times during the Component's lifecycle.
- `ngOnChanges()`: Called after the constructor but before `ngOnInit` and also when data-bound input changes.
- `ngOnInit()`: Called immediately after the first `ngOnChanges` and only once.
- `ngOnDestroy()`: Runs before the component is unmounted.
- There are other Lifecycle hooks that occur at different points in the lifecycle.

## Event Emitters:

- Custom events that send information between components synchronously or asynchronously.
- Utilizes the `@Input` and `@Output` decorators.
- Enables communication between nested components.

## Publisher/Subscriber (Pub/Sub) Design Patterns:

- Describes a flow of messages between applications, devices, or services.
- Publishers push messages to channels (streams).
- Subscribers are subscribed to channels and are notified of new messages produced by publishers.
- Applications can be both a publisher and subscriber.
    <img src="pubsub.png" alt="Example Image" width="200" height="300">

## Observable Design Pattern

- A sub-design pattern of the pub/sub pattern
- Utilizes a Subject that maintains observers. Observers subscribe to the subject.
- Angular's HttpClientModule uses this with RxJS observables for sending HTTP requests and receiving
responses.

## RxJS (Reactive extension for JavaScript):

- Framework for reactive programming using Observables for writing asynchronous code.
- RxJS Subjects allow multicasting values to multiple observers.

## Angular Observable Objects:

- Used for event handling, asynchronous programming, and handling multiple values.
- Observables vs Promises: Observables can unsubscribe and receive multiple values.
- Subscribe to an Observable with callback functions: `next()`, `error()`, and `complete()`

## HttpClient: 

- The `HttpClient` class, found within the `HttpClientModule`, streamlines HTTP requests and responses in Angular, utilizing RxJS Observables. Key attributes include: 
    - Supports typed request and response objects with TypeScript.
    - Asynchronous with Observables.
    - Built-in error handling and testing features.

## AngularJS vs Angular vs Angular 4+:

- AngularJS was the first version of Angular developed by Google, using JavaScript.
- Angular introduced TypeScript and was often referred to as Angular 2, causing confusion.
- Angular 4+ followed the messy versioning and development timeline.
- AngularJS information is not applicable to modern Angular development.

## MVC in Angular:

- Models: Data classes, often in a "models" folder.
- Views: Components, including the HTML template.
- Controllers: Services, containing logic.

## **Vulnerable and Outdated Components - Mitigating Risks**

[OWASP Documentation](https://owasp.org/Top10/2021/A06_2021-Vulnerable_and_Outdated_Components/)

### **Introduction:**

- Software development often involves integrating third-party libraries, components, and dependencies into our project.
- These components can introduce security risks, especially if they contain vulnerabilities or are outdates.
- The OWASP (Open Web Application Security Project) provides guidance on identifying and mitigating risks associated with vulnerable and outdated components.

**Understanding the Risks:**

1. **Vulnerabilities:** Components may have security vulnerabilities that can be exploited by attackers.
    - Examples include code injections, cross-site scripting (XSS), and SQL injection vulnerabilities.
    - Hackers often target widely used libraries since they can impact a large number of applications.
2. **Outdated Components:**
    - Updates may include security patches, bug fixes, and performance improvements.
    - Without updates, applications remain vulnerable to known attacks.

**Impact of Vulnerabilities:**

- Vulnerable components can lead to data breaches, unauthorized access, and service disruptions.
- Consequences may include financial loss, reputational damage, and legal implications.
- Developers need to proactively manage dependencies to minimize risk.

