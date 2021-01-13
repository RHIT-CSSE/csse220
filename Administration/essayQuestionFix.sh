#!/bin/bash

# Author: Jason Yoder
# email: yoder1@rose-hulman.edu

# You should run this program in Git Bash
# https://git-scm.com/downloads

# This folder should contain folders that are in the format:   useranme - full name, AttemptX - timestamp
DIRECTORY_WITH_ATTEMPTS="/d/G/exam1_winter2021/Exam1Map2DArray/"

IFS=$(echo -en "\n\b")
#      loop through above directory      ignore the Question text entry
dirs=$( ls "$DIRECTORY_WITH_ATTEMPTS" | grep -v "Question text" )

#rename all filepaths to include underscores instead of spaces
echo "Renaming folders to remove spaces"
for dir in $dirs; do
    renamed_dir=$( echo "$dir" | sed "s/\s//g")
    mv "$DIRECTORY_WITH_ATTEMPTS/$dir" "$DIRECTORY_WITH_ATTEMPTS/$renamed_dir"
    echo "renamed $dir to be $renamed_dir"
done


dirs=$( ls "$DIRECTORY_WITH_ATTEMPTS" | grep -v "Question text" )

for dir in $dirs; do
  echo "moving all files from $DIRECTORY_WITH_ATTEMPTS/$dir/Attempt*_attachment/ to $DIRECTORY_WITH_ATTEMPTS/$dir/"
  mv $DIRECTORY_WITH_ATTEMPTS/$dir/Attempt*_attachment/*.* $DIRECTORY_WITH_ATTEMPTS/$dir/
  echo "Removing folder $DIRECTORY_WITH_ATTEMPTS/$dir/Attempt*_attachment/"
  rm -r $DIRECTORY_WITH_ATTEMPTS/$dir/Attempt*_attachment/
done

