Feature: Group Chat Stagging Cicle App

  @Chat @TC01 @Positive
  Scenario: Send letter message in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input letter message
    And Send message
    Then Should succes send message

  @Chat @TC02 @Positive
  Scenario: Send number message in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input number message
    And Send message
    Then Should succes send message

  @Chat @TC03 @Positive
  Scenario: Send symbol message in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input symbol message
    And Send message
    Then Should succes send message

  @Chat @TC04 @Positive
  Scenario: Send message using another counrty's language in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input language message
    And Send message
    Then Should succes send message

  @Chat @TC05 @Positive
  Scenario: Send emot message in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input emot message
    And Send message
    Then Should succes send message

  @Chat @TC06 @Positive
  Scenario: Send letter and number message in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input letter and number message
    And Send message
    Then Should succes send message

  @Chat @TC07 @Positive
  Scenario: Send letter, number and emot message in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input letter, number and symbol message
    And Send message
    Then Should succes send message

  @Chat @TC08 @Positive
  Scenario: Send letter, number and symbol message in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input letter, number and symbol message
    And Send message
    Then Should succes send message

  @Chat @TC09 @Positive
  Scenario: Mention name member in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Cick icon @
    And Click member
    And Send chat
    Then Should succes mention member

  @Chat @TChat10 @Positive
  Scenario: Cancel mention name member in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Cick icon @
    And Click button X
    Then Should succes cancel mention member

  @Chat @TC11 @Negative
  Scenario: Send message without input anything
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Do not fill anything
    Then Should failed to send message and not show button send message

  @Chat @TC12 @Negative
  Scenario: Send message longer than 99 words
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Input message of more than 99 words
    And Send chat
    Then Should failed to send message

  @Chat @TC13 @Negative
  Scenario: Upload 2 pictures in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Click icon attachment
    And Click gallery
    And Select 2 pictures
    And Upload file
    Then Should failed to upload pictures

  @Chat @TC14 @Negative
  Scenario: Upload 2 videos in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Click icon attachment
    And Click gallery
    And Select 2 videos and upload file videos
    And Upload file
    Then Should failed to upload videos

  @Chat @TC15 @Negative
  Scenario: Upload apk files in group chat
    Given User open cicle app
    When Click test big project
    And Click group chat
    And Click icon attachment
    And Click document
    And Upload apk file
    Then Should failed to upload file
