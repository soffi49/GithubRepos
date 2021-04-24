# GithubRepos 📄
The program was written as a part of the Allegro Summer E-experience recruitment (task no.3). Its main goal is to list repositories for some Github user. In the output, it provides:
- *user name*
- *repositories names & stars*
- *count of stars*
## What you will need 🛠
- Java 11 JDK
## How to install it 🔎
It is really simple:
1. Download the zip file containing all of the above folders + files
2. Unzip it wherever you want
3. Go to your favourite IDE (I highly recommend Intellij)
4. Create project from Existing Sources (in Intellij- File->New->Project From Existing Sources)
5. Choose a folder containing your project and then choose the pom.xml file
6. It may take a while, but your project will be loaded 👩‍💻
## How to use it 🔧
The program will communicate with your local host. Thus to use it, firstly run your program (using IDE run or terminal) and then simply go to `http://localhost:8080/` 
on your browser.\
The goal of the task was to make software which will allow to list repositories but additionaly I provided a simple interface to make user experience more friendly. You will see a form in which you can give a username. To submit the information, click submit button, and that's all.
## Technologies used 💻
For my project, I used `Spring Boot` with `Maven project` and dependencies:
- `Validation`
- `Spring Web`
- `Thymeleaf`

My program is written in `Java 11`, but for designing a website, I also used `HTML` and `CSS`.
## Cool features 😎
Here are some ideas of future capabilities which can be added to the project:
- **More details** button - user will have the possibility to display more information about repositories (like forks, watchers count, language etc.)
- **Sort** button - allows user to sort repositories by the chosen by user factor (like stars count, name, language etc.)
- **Add next** button - user can add multiple GitHub users to the database and then, base on that, make some operations between them
- **Compare** button - allows comparing two (or more) users based on some criteria
