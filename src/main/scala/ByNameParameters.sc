var assertionsEnabled = true

def myAssert(predicate: () => Boolean) = {
  if (assertionsEnabled && !predicate())
    throw new AssertionError()
}

myAssert(() => 5 > 3)
myAssert(5 > 3) // Won't work, because missing () =>

def byNameAssert(predicate: => Boolean) = {
  if (assertionsEnabled && !predicate)
    throw new AssertionError()
}

byNameAssert(5 > 3)

def boolAssert(predicate: Boolean) = {
  if (assertionsEnabled && !predicate)
    throw new AssertionError()
}

/*
    The same as byNameAssert, but expression 5 > 3 evaluate.
    In byNameAssert expressions evaluates whet it's caused
 */
boolAssert(5 > 3)

