    
    # class ShoppingCart:
    #     def __init__(self, store):#method
    #         self.store = store#attribute
    #         self.total = 0#attribute
    #     def add_item(self, item, price):#method
    #         self.items.append(item)#method
    #         self.total += price#attribute
    #         self.items = []#attribute
            
    # return self


class ShoppingCart:
    
    def __init__(self, store):
        self.total = 0
        self.store = store
        self.items = []
    
    def add_item(self, item, price):
        self.total += price
        self.items.append(item)
        return self

    def show_cart(self):
        print(f"sStore: {self.store},total: (self.total)")
        

jeremy_shopping_cart= ShoppingCart("BestBuy")
print(jeremy_shopping_cart.store)