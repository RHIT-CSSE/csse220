require 'date'
require 'yaml'

start_date = Date.new(2018, 8, 30)
end_date = Date.new(2018, 11, 11)
vacation_start = Date.new(2018, 10, 11) #inclusive
vacation_end = Date.new(2018, 10, 12) # inclusive
allowed_days_of_week = [1,3,5] # monday is 1

day_list = []
current = start_date;
while(current <= end_date)
  if(current < vacation_start or current > vacation_end)
    day_list << current
  end
  current = current.next_day()
end
day_list =  day_list.keep_if { |d| allowed_days_of_week.include?(d.cwday()) }
class_index = 0;
string_list = day_list.map { |d|
  class_index = class_index + 1
  { "type" => "class_session",
    "class_num" => class_index,
    "date" => d.to_time().strftime("%Y-%m-%d 08:00") }
}
puts string_list.to_yaml
$stderr.puts "#{day_list.length} days output"
