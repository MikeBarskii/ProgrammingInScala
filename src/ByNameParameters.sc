var assertionsEnabled = true

def myAssert(predicate: () => Boolean) =
  if (assertionsEnabled && !predicate())
    throw new AssertionError()

myAssert(() => 5 > 3)
myAssert(5 > 3) //won't work

def byNamesAssert(predicate: => Boolean) =
  if (assertionsEnabled && !predicate)
    throw new AssertionError()

byNamesAssert(() => 5 > 3) //won't work
byNamesAssert(5 > 3)