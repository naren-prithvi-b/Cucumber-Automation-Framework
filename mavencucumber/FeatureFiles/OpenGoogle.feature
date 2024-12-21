Feature: This is to search in google
Scenario: Open google search
 Given user entering google.co.in
 When user search for "naren prithvi b"
 And enter the return key
 Then google should display the result