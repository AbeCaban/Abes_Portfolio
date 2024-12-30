import time
import psutil

def is_game_running(game_name):
    """Check if a game is running."""
    for process in psutil.process_iter():
        try:
            if process.name() == game_name:
                return True
        except (psutil.NoSuchProcess, psutil.AccessDenied, psutil.ZombieProcess):
            pass
    return False

def gaming_stopwatch(game_name):
    """Track the time spent playing a game."""
    total_time = 0
    start_time = None

    while True:
        if is_game_running(game_name):
            if start_time is None:
                start_time = time.time()
        else:
            if start_time is not None:
                end_time = time.time()
                total_time += end_time - start_time
                start_time = None
                print("Game closed. Total time played:", total_time)

        time.sleep(1)  # Check every 1 second

if __name__ == "__main__":
    game_name = "game.exe"  # Replace with the actual game executable name
    gaming_stopwatch(game_name)