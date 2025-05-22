# SI_2025_lab2_233140
Кристијан Јовиќ
233140
# Control Flow Graph
![CFG checkCart](https://github.com/user-attachments/assets/1f9f22b5-c3c3-42fa-bcdd-3562c9acc1fc)
# Циколматска Комплексност
Ја пресметав преку форумлата E-N+2 односно 32-25+2=5. 
Е претставуваат ребрата, а N претставуваат јазлите.
# Тест случаи според критериумот Every statement
Test Cases:
1: checkCart(null,"21315") -- Ги проаѓа A,B (влага во RunTimeException allItems   list cant be null)
2: Item obj (name: null, quantity: 1,price: 10, discount: 5) items.add(obj); checkCart(items,"21456") -- Ги проаѓа A,C,D1,D2,E,F,G (runTimeException Invalid Item)
3: Item obj (name: "lip gloss", quantity: 1,price: 10, discount: 5) items.add(obj); checkCart(items,"21456") -- Ги проаѓа A,C,D1,D2,E,F,H,I,J,K,D3,N,U,V (runTimeException Invalid card number!)
4: Item obj (name: "lip gloss", quantity: 1,price: 10, discount: 0) items.add(obj); checkCart(items,"21456") -- Ги проаѓа A,C,D1,D2,E,F,H,J,L,M,D3,N,U,V (runTimeException Invalid card number!)
5: Item obj (name: "lip gloss", quantity: 1,price: 10, discount: 5) items.add(obj); checkCart(items,"2145653784915478")	-- Ги проаѓа A,C,D1,D2,E,F,H,I,J,K,D3,N,O,P,Q1,Q2,R,S,X (Не влага во Invalid character in card number!)
6: Item obj (name: "lip gloss", quantity: 1,price: 10, discount: 5) items.add(obj); checkCart(items,"A145653784915478")	-- Ги проаѓа A,C,D1,D2,E,F,H,I,J,K,D3,N,O,P,Q1,Q2,R,S,T RuntimeException("Invalid character in card number!")
-- Јазлите ќе бидат обележани во Java кодот.
# Тест случаи според Multiple Condition критериумот
Можни тест случаи: 2^3 со оглед на тоа што имаме три conditions (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10).
1: F F F (Не се извршува if blockot)
2: Т F F 
3: F T F
4: F F T
5: T T F
6: T F T
7: F T T
8: T T T
