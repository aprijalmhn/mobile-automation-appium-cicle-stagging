Feature: Checkin Stagging Cicle App

  @Checkin @TCI01 @Positive
  Scenario: Create checkin
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click button plus checkin
    And Input question 'How are you?'
    And Select day often want to ask
    And Click button START COLLECTING ANSWER
    Then Should succesfully create checkin

  @Checkin @TCI02 @Positive
  Scenario: Create checkin with notifed
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click button plus checkin
    And Add member you want to notifed
    And Input question 'Test123'
    And Select day often want to ask
    And Click button START COLLECTING ANSWER
    Then Should succesfully create checkin with add notifed

  @Checkin @TCI03 @Positive
  Scenario: Create checkin with 2 day often you want to ask
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click button plus checkin
    And Input question 'Test12e'
    And Select 2 day often want to ask
    And Click button START COLLECTING ANSWER
    Then Should succesfully create checkin with inquiries for 2 days

  @Checkin @TCI04 @Positive
  Scenario: Cancel create checkin
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click button plus checkin
    And Click icon <
    Then Should succes cancel create checkin

  @Checkin @TCI05 @Positive
  Scenario: Update checkin
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click checkin want to update
    And Click pencil icon
    And Edit checkin
    And Click button START COLLECTING ANSWER
    Then Should succesfully update checkin

  @Checkin @TCI06 @Positive
  Scenario: Cancel update checkin
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click checkin want to update2
    And Click pencil icon
    And Click icon <
    Then Should succes cancel update checkin

  @Checkin @TCI07 @Positive
  Scenario: Add comment checkin
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click checkin want to comment
    And Click add new comment
    And Input new comment 'tester'
    And Click button send
    Then Should succesfully add comment checkin

  @Checkin @TCI08 @Positive
  Scenario: Add new comment bold in checkin
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click checkin want to comment
    And Click Add comment
    And Click icon B
    And Input coment
    And Click button send
    Then Should succesfully add comment bold in checkin

  @Checkin @TCI09 @Positive
  Scenario: Add member in checkin
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Add member
    And Input and search name member checkin
    And Click name member checkin
    Then Should succesfully add member checkin

  @Checkin @TCI10 @Positive
  Scenario: Cancel add member in checkin
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Add member checkin
    And Click icon X checkin
    Then Should successfully cancel add member

  @Checkin @TCI11 @Negative
  Scenario: Create checkin without input question
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click button plus checkin
    And Click button START COLLECTING ANSWER
    Then Should failed create checkin

  @Checkin @TCI12 @Negative
  Scenario: Create checkin without select day
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click button plus checkin
    And Without select day
    And Click button START COLLECTING ANSWER
    Then Should failed create checkin

  @Checkin @TCI13 @Negative
  Scenario: Add comment without input anything
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click checkin want to comment wtihout input anything
    Then Shouldn't show up the submit button

  @Checkin @TCI14 @Negative
  Scenario: Cancel add comment with uploading pictures
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click checkin want to comment
    And Click add new comment
    And Click icon pictures
    And Click button Batal
    Then Should faield upload pictures and show alert

  @Checkin @TCI15 @Negative
  Scenario: Cancel add comment with uploading video
    Given User open cicle app3
    When Click test big project3
    And Click checkin
    And Click checkin want to comment
    And Click add new comment
    And Click icon videos
    And Click button Batal
    Then Should faield upload videos and show alert








