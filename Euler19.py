import datetime

start = datetime.date(1901, 1, 1)
end = datetime.date(2000, 12, 31)

counter = 0
while start <= end:
    if (start.isoweekday() == 7) & (start.day == 1):
        counter += 1
    start = start + datetime.timedelta(days = 1)
print(counter)