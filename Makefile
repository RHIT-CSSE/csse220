SHELL = /bin/bash

# Mostly some commands to allow you to demo the jekyll site locally
# 
# all the relevant details are here:
# https://help.github.com/en/articles/setting-up-your-github-pages-site-locally-with-jekyll

# this needs to be run to download the neccessary gems
# should be only needed once
install:
	bundle install

# This updates the version of all the dependencies. Only needs to be
# done once in a while or when github complains about old versions
update:
	bundle update

# this is the actual command you need to to start the preview
demo:
	bundle exec jekyll serve --watch                                

gen_dates:
	ruby Administration/gen_dates.rb > _data/date_convert.yml
