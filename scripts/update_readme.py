import os
import re

PROBLEMS_DIR = "." 
README_PATH = "./README.md"

def get_current_problem_count():
    pattern = re.compile(r"^\d+-")
    folders = [
        name for name in os.listdir(PROBLEMS_DIR)
        if os.path.isdir(name) and pattern.match(name)
    ]
    return len(folders)

def update_readme_count():
    count = get_current_problem_count()

    with open(README_PATH, "r", encoding="utf-8") as f:
        lines = f.readlines()

    new_lines = []
    for line in lines:
        if line.strip().startswith("#### **Current LeetCode("):
            new_line = f"#### **Current LeetCode({count}/500)**\n"
            new_lines.append(new_line)
        else:
            new_lines.append(line)

    with open(README_PATH, "w", encoding="utf-8") as f:
        f.writelines(new_lines)

    print(f"README updated: {count}/500")

if __name__ == "__main__":
    update_readme_count()
