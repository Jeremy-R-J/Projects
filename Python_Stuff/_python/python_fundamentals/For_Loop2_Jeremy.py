# Biggie Size - Given a list, write a function that changes all positive numbers in the list to "big".
# Example: biggie_size([-1, 3, 5, -5]) returns that same list, but whose values are now [-1, "big", "big", -5]

# write a function that creates a variable for a string switch all positive numbers to big
# def Makeb(Boba):
#     for i in range(len(Boba)):
#         if Boba[i]>0:
#             Boba[i]= "big"
#     return Boba
# Boba=[5,-5,15,9]
# print(Makeb(Boba))

# Count Positives - Given a list of numbers, create a function to replace the last value with the number of positive values. (Note that zero is not considered to be a positive number).
# Example: count_positives([-1,1,1,1]) changes the original list to [-1,1,1,3] and returns it
# Example: count_positives([1,6,-4,-2,-7,-2]) changes the list to [1,6,-4,-2,-7,2]

#write a functtion //switch last value to #of positive numbers in value
# def countpos(postr):
#     count = 0
#     for i in postr:
#         if i > 0:
#             count += 1
#     postr[len(postr)-1]=count
            
#     return postr

# print(countpos([1,6,-4,-2,-7,-2]))


#3Sum Total - Create a function that takes a list and returns the sum of all the values in the list.
# Example: sum_total([1,2,3,4]) should return 10
# Example: sum_total([6,3,-2]) should return 
# def total(num3):
#     count=0
#     for i in num3:
#         count = count+ i
#     return count
    
# print (total([1,2,3,4]))


# Average - Create a function that takes a list and returns the average of all the values.x
# Example: average([1,2,3,4]) should return 2.5
# def total(num3):
#     count=0
#     for i in num3:
#         count = count+ i
        
#     return count/len(num3)
    
# print (total([1,2,3,4]))


#5.Length - Create a function that takes a list and returns the length of the list.
# Example: length([37,2,1,-9]) should return 4
# Example: length([]) should return 0




# def total(num3):
#     count=0
#     for i in num3:
#         count = count+ 1
        
#     return count
    
# print (total([1,2,3,4]))
#


#6. Create a function that takes a list of numbers and returns the minimum value in the list. If the list is empty, have the function return False.
# Example: minimum([37,2,1,-9]) should return -9
# Example: minimum([]) should return False

# def minliss(list):
#     current_min = list[0]
#     for num in list:
#         if num < current_min:
#             current_min = num
#     return current_min

# print minliss([37,2,47,16,-8])

# 7.Create a function that takes a list and returns the maximum value in the list. If the list is empty, have the function return False.NO
# need to go back and look later dosent run on mine ran on TH
# x=[]
# def minimum(list):
#     if len(list) == 0:
#         return False
#     current_max = list[0]    
#     for num in range(len(list)):
#         # Loop through each number in the list    
#         if list[num] > current_max:
#             current_max = list[num]  # Update current_min if current number is less
#     return current_max

# print(minimum(x))
# print(minimum([37,2,55,-9]))
# 8.Create a function that takes a list and returns a dictionary that has the sumTotal, average, minimum, maximum and length of the list.
#number 8 I had trouble need help witth this spent 40 min on it.

# def ul_anl(myLst):
#     lstLength = len(myLst) #fo through loop
#     sumtotal = 0
#     avg = 0
#     max = myLst[0]
#     min = myLst[0]
#     results = {}
#     for i in range(0,lstLength,1):
#         sumtotal=sumtotal+myLst[i]
#         if max < myLst[i]:
#             max = myLst[i]
#         if min  > myLst[i]:
#             min = myLst[i]
#     avg = sumtotal / lstLength

#     results = {'sumtTotal': sumtotal,'average':avg,'minimum':min,'maximum':max }

#     return results


# print(ul_anl([37,2,55,-9]))    
    


#Reverse List - Create a function that takes a list and return that list with values reversed. Do this without creating a second list. (This challenge is known to appear during basic technical interviews.)
# Example: reverse_list([37,2,1,-9]) should return [-9,1,2,37]
# def Reverse(parameter_list):
#     return [ele for ele in reversed(parameter_list)]

# print(Reverse([37,2,1,-9]))


# x=[]
# print (len(x))