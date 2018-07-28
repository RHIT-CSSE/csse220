SHELL = /bin/bash

demo:
	bundle exec jekyll serve --watch                                

gen_dates:
	ruby Administration/gen_dates.rb > _data/date_convert.yml
