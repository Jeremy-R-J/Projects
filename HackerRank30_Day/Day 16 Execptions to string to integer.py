Day 16 Execptions to string to integer

import sys




S = input().strip()
    
try:
    int_val = int(S)
    print (int_val)
except ValueError:
    print('Bad String')
    