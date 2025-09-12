## Requirements

- [ ] Goals
- [ ] Input/Output
- [ ] Edge cases
🌙🍵

🍵 Cozy Brew Timer Checklist
Phase 1: Project Setup

 Create repo CozyBrew with Sprout (or manually if needed).
 Add initial README explaining what the project does.
 Commit: "init: Cozy Brew Timer scaffold 🌙🍵"

Phase 2: Tea Data

 Decide final MVP steep times and temps:
Green → 2 min @ 80 °C
Black → 4 min @ 100 °C
Herbal → 6 min @ 100 °C
Oolong → 4 min @ 90 °C
White → 2 min @ 85 °C

 Add aliases:
green | sencha
black | black tea
herbal | tisane
oolong
white

 Store all tea info in one clear spot for easy edits later.
 Commit: "feat: add tea timing and temperature table"

Phase 3: Core Program Flow (MVP)

 Print welcome message:
“Welcome to Cozy Brew! 🌙 What tea are you steeping today?”
 Prompt for tea type, read user input.
 Normalize input (trim, lowercase).
 Match tea type → display steep time + temperature.
 If tea is unknown, print list of valid teas.
 After result, ask:
“Brew another cup? (yes/no)”
 Loop if yes, exit with goodbye message if no.
 Commit: "feat: implement core loop for tea brewing"

Phase 4: Friendly Input Handling

 Handle mixed case (White, WHITE, etc.).
 Handle empty input gracefully.
 Display a helpful message for invalid tea:
“I know green, black, herbal, oolong, white. Try one of those!”
 Support y, yes, n, no for replay prompt.
 Commit: "chore: improve input validation and user experience"

Phase 5: Optional Sprinkles (Pick 1 Today)

 Timer simulation: 3…2…1… Tea’s ready!
 Units toggle: °C or °F option.
 Strength slider: light, medium, strong adjusts steep time.
 Favorites: save a preferred tea with keyword fav.
 Commit: "feat: add <chosen feature>"

Phase 6: Final Polish

 Goodbye message is cozy and friendly.
 Output lines neat and aligned, emojis consistent.
 README updated with:
Description
Features
How to run
Example output
 Screenshot added to README (optional).
 Commit: "docs: final polish and README updates"

Testing Pass

Run these tests in order:
 Input: green → “2 min @ 80 °C”
 Input: Black → “4 min @ 100 °C”
 Input: herbal → “6 min @ 100 °C”
 Input: oolong → “4 min @ 90 °C”
 Input: WHITE → “2 min @ 85 °C
 Input: chai → friendly invalid message + list
 Empty input → prompts again without crashing
 Replay prompt works (yes loops, no exits)

Victory Lap

 Final commit: "release: Cozy Brew Timer MVP complete 🌙🍵"
 Push to GitHub and confirm everything appears correctly.
 Share a cozy screenshot on Instagram or with Luna!