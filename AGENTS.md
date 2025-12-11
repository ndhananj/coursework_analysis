# Repository Guidelines

## Project Structure & Module Organization
- Topics live in `topic1_arrays` through `topic8_recursion`. Place solutions directly in the topic folder; distinguish languages by file extension (`.java`, `.py`, `.rs`, etc.) and keep problem names consistent (e.g., `AVeryBigSum.java`, `AVeryBigSum.py`).
- Top-level docs: `README.md` (course overview) and `AGENTS.md` (this guide). No centralized test or build directories exist; each solution is standalone.

## Build, Test, and Development Commands
- Java: compile/run a single solution, e.g. `javac topic1_arrays/AVeryBigSum.java && java Solution < input.txt`.
- Python: run directly, e.g. `python topic1_arrays/AVeryBigSum.py < input.txt`.
- Environment prep: if a `requirements.txt` appears, use `pip install -r requirements.txt` before running Python solutions.

## Coding Style & Naming Conventions
- Match existing problem filenames when adding other languages; only the extension should differ.
- Prefer simple, standard library–only solutions unless a problem requires more.
- Keep code self-contained with minimal I/O scaffolding mirroring the problem statement.

## Testing Guidelines
- Provide quick sanity checks via sample inputs/outputs in comments or separate fixtures when helpful.
- Scripts should accept input from stdin to mirror online judge behavior, enabling easy piping of test cases.

## Commit & Pull Request Guidelines
- Commit messages: short, imperative, and scoped to a single problem or change (e.g., “Add Python version of AVeryBigSum”).
- Pull requests (if used): describe the problem solved, language added, and any testing performed; note sample cases you ran.

## Agent-Specific Instructions
- Favor minimal structural change: keep all languages in the same topic folders by extension.
- Do not delete or rename existing solutions; add alternatives alongside them.
- If tooling is needed, prefer `pip install -r requirements.txt` for Python dependencies.***
