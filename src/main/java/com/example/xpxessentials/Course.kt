package com.example.xpxessentials

public class Course(var courseName: String, var url: String, var descrption: String, var hours: Int, var categories: Array<String>, var resources:Array<String> ){

    private val courseTitle: String
    private val courseURL: String
    private val courseDescription: String
    private val courseEstimatedHours: Int
    private val courseCategories: Array<String>
    private val additionalResources: Array<String>

    init{
        courseTitle = courseName
        courseURL = url;
        courseDescription = descrption
        courseEstimatedHours = hours
        courseCategories = categories
        additionalResources = resources
    }

}