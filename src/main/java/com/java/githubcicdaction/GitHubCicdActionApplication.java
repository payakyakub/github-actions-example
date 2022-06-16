package com.java.githubcicdaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubCicdActionApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Java Sptring Boot...!!!";
    }

    /*echo "# github-actions-example" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/payakyakub/github-actions-example.git
    git push -u origin main*/

    public static void main(String[] args) {
        SpringApplication.run(GitHubCicdActionApplication.class, args);
    }

}
