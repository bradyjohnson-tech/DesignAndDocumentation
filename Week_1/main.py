import random

'''I used AI(Jetbrains) to create this code for rock, paper, scissors, I then added my comments
 to describe each function. '''
class RockPaperScissors:
  '''A class that represents the Rock-Paper-Scissors game.'''

  def __init__(self):
    '''Initializes the game with default values.'''
    self.choices = ["rock", "paper", "scissors"]

  def get_player_choice(self):
    '''This method prompts the user to choose rock, paper, or scissors and returns the choice.'''
    while True:
      choice = input("Choose rock, paper, or scissors: ").lower()
      if choice in self.choices:
        return choice
      else:
        print("Invalid choice. Please try again.")

  def get_computer_choice(self):
    '''This method randomly selects and returns one of the three choices: rock, paper, or scissors.'''
    return random.choice(self.choices)

  def determine_winner(self, player_choice, computer_choice):
    '''This method determines the winner based on player and computer choices.'''
    print("You chose:", player_choice)
    print("Computer chose:", computer_choice)

    if player_choice == computer_choice:
      print("It's a tie!")
    elif (player_choice == "rock" and computer_choice == "scissors") or \
            (player_choice == "paper" and computer_choice == "rock") or \
            (player_choice == "scissors" and computer_choice == "paper"):
      print("You win!")
    else:
      print("Computer wins!")

  def play(self):
    '''The main method that controls the game logic.'''
    while True:
      player_choice = self.get_player_choice()
      computer_choice = self.get_computer_choice()
      self.determine_winner(player_choice, computer_choice)

      play_again = input("Play again? (y/n): ").lower()
      if play_again != "y":
        print("Thanks for playing!")
        break


# Run the game
if __name__ == "__main__":
  game = RockPaperScissors()
  game.play()