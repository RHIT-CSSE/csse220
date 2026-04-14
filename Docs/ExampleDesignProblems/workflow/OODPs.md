# CSSE220 Object Oriented Design Principles

When considering design you should go through a checkdown for assessing the design. You want to have a critical perspective looking for problems, not just any problems but the biggest and most severe problems. As you look to address problems, we ask you to identify the first in this ordered list.

***If the code does not function, then nothing else matters!***

1. Make sure your design **allows proper functionality**
  a. Must be able to **store required information** (one/many to one/many relationships)
  b. Must be able to **access the required information** to accomplish tasks
  c. Data should **not be duplicated** (id/identifiers are OK!)

---
There are many possible functional designs for most problems. The following principles help us to make design choices to allow code to be used and extended easily. Normally, even a well-stated problem is revised and requires changes to design. To help make the re-design process smooth, the following guiding principles should be followed:

2. Structure design **around the data** to be stored
  a. **Nouns should become classes** (within reason)
  b. **Classes should have intelligent behaviors** (methods) **that may operate on their data**. (encapsulation) This "pushes the intelligence down" so a programmer can think less and do more.

3. Functionality should be **distributed efficiently**
  a. **No class/part should get too large**
  b. **Each class should have a single responsibility** it accomplishes (high cohesion)

4. **Minimize dependencies** between objects when it does not disrupt usability or extendability (low coupling)
  a. Tell don't ask
  b. Don't have message chains

5. **Don't duplicate** code
  a. Similar "chunks" of code should be **unified into functions**
  b. Classes with similar features should be given **common interfaces**
  c. Classes with similar internals should be simplified using **inheritance**
  d. Avoid all type-predicated code by using **inheritance**

