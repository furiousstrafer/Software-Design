def read_words(filename):
  try:
    with open(filename) as file:
      return file.read().splitlines()

  except FileNotFoundError:
    print(f"Error: File '{filename}' not found!")
    return []

  except PermissionError:
    print(f"Error: No permission to read file '{filename}'!")
    return []

  except UnicodeDecodeError:
    print(f"Error: File '{filename}' has invalid format!")
    return []
