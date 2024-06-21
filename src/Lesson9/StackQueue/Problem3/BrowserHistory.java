package Lesson9.StackQueue.Problem3;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentUrl;

    public BrowserHistory(String currentUrl) {
        this.backStack = new Stack<>();
        this.forwardStack = new Stack<>();
        this.currentUrl = currentUrl;
    }

    public void visit(String url) {
        backStack.push(currentUrl);
        currentUrl = url;
        forwardStack.clear();
        System.out.println("Visited : " + currentUrl);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentUrl);
            currentUrl = backStack.pop();
            System.out.println("Back to : " + currentUrl);
        } else {
            System.out.println("There is no history");
        }
    }

    public void forward() {
        if(!forwardStack.isEmpty()) {
            backStack.push(currentUrl);
            currentUrl = forwardStack.pop();
            System.out.println("Forward to : " + currentUrl);
        } else {
            System.out.println("No page to forward");
        }
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public static void main(String[] args) {
        // Start with home.html
        BrowserHistory browser = new
                BrowserHistory("home.html");
        browser.visit("page1.html"); // Current URL
        browser.visit("page2.html"); // Current URL
        browser.back(); // Goto page1.html
        browser.back(); // Goto home.html
        browser.forward(); // Goto page1.html
        browser.forward(); // Goto page1.html
        browser.visit("page3.html"); // Current URL
    }

}
