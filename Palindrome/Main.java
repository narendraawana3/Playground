s = input()
a = []
for i in range(0,len(s)):
  a.append(s[i])
if(a[0:] == a[::-1]):
	print(1)
else:
  print(0)