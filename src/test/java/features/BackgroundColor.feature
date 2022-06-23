@BackgroundColorFeature @Regression
Feature: Background Color Button Functionality Validation 

Background: 
Given User is on the provided webpage

@Scenario1: 
Scenario:User should be able to change the background color by clicking the buttons

When the user clicks set skyblue background button
Then the background color should change to blue 

@Scenario2:
Scenario:User should be able to change the background color by clicking the buttons

When the user clicks set white background button
Then the background color should change to white