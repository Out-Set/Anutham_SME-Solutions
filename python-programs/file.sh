first=$(zenity --title="Your name" --text "what is your name?" --entry)
pass=$(zenity --password)


first=$(zenity --calendar)
zenity --info --title="Showing date" --text="$first"
