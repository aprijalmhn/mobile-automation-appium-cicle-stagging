Feature: Board Stagging Cicle App

  @Board @TB01 @Positive
  Scenario: Add list successfully
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click button plus
    And Click add list
    And Input list name
    And Click button ADD
    Then Should succes add list

  @Board @TB02 @Positive
  Scenario: Add card successfully
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click button plus
    And Click add card
    And Select list
    And Input card name
    And Click button ADD
    Then Should succes add card

  @Board @TB03 @Positive
  Scenario: Cancel add card
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click button plus
    And Click add card
    And Select list
    And Click button icon X
    Then Should succes cancel add card

  @Board @TB04 @Positive
  Scenario: Add member card in board
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Add members
    And Search and select name member
    Then Should succesfully add member

  @Board @TB05 @Positive
  Scenario: Cancel add member
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Add members
    And Click icon X
    Then Should succesfully cancel add member

  @Board @TB06 @Positive
  Scenario: Set due date
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click due date
    And Set date
    And Click button OKE
    And Set the time
    And Click button OKE2
    Then Should succesfully set due date

  @Board @TB07 @Positive
  Scenario: Remove due date
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button REMOVE due date
    Then Should succesfully remove due date

  @Board @TB08 @Positive
  Scenario: Cancel set due date
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click due date
    And Click button BATAL
    Then Should succesfully cancel due date

  @Board @TB09 @Positive
  Scenario: Add label
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button plus label
    And Input label name
    And Select color
    And Click button SEND
    Then Should succesfully add label

  @Board @TB10 @Positive
  Scenario: Cancel add label
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button plus label
    And Click icon X label
    Then Should succesfully cancel add label

  @Board @TB11 @Positive
  Scenario: Select label
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button select label
    And Select label
    Then Should succesfully select label

  @Board @TB12 @Positive
  Scenario: Cancel select label
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button label
    And Click icon X
    Then Should succesfully cancel select label

  @Board @TB13 @Positive
  Scenario: Remove label
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button test label
    And Select label
    Then Should succesfully remove label

  @Board @TB14 @Positive
  Scenario: Move card
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card2
    And Click button MOVE
    And Click list
    And Select list2
    And Click button MOVE
    Then Should succesfully move card

  @Board @TB15 @Positive
  Scenario: Cancel move card
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button MOVE
    And Click textfield close
    Then Should succesfully cancel move card

  @Board @TB16 @Negative
  Scenario: Add list without input name
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click button plus
    And Click add list
    And Click button ADD
    Then Should failed add list and show alert

  @Board @TB17 @Negative
  Scenario: Add card without input name
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click button plus
    And Click add card
    And Click button ADD
    Then Should failed add card and show alert

  @Board @TB18 @Negative
  Scenario: Add label card without input name
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button plus label
    And Click button SEND
    Then Should failed add label

  @Board @TB19 @Negative
  Scenario: Move card without select list
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Click button MOVE
    Then Should failed move card and show alert

  @Board @TB20 @Negative
  Scenario: Add coments without input anything
    Given User open cicle app2
    When Click test big project2
    And Click board
    And Click card
    And Add new comment wihout filling anything
    Then Should not be able to send messages