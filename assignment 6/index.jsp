<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Random Inspirational Quote</title>
</head>
<body>
    <h1>Inspirational Quote of the Day</h1>
    <blockquote>
        <%= getRandomQuote() %>
    </blockquote>
    
    <%!
    String[] quotes = {
        "The only way to do great work is to love what you do. - Steve Jobs",
        "In the middle of difficulty lies opportunity. - Albert Einstein",
        "Believe you can and you're halfway there. - Theodore Roosevelt",
        "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
        "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
        "Your limitation—it’s only your imagination.",
        "Push yourself, because no one else is going to do it for you.",
        "Great things never come from comfort zones.",
        "Dream it. Wish it. Do it."
    };

    String getRandomQuote() {
        Random rand = new Random();
        int index = rand.nextInt(quotes.length);
        return quotes[index];
    }
    %>
</body>
</html>
