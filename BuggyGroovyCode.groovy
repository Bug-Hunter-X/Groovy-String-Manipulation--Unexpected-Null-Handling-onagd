```groovy
def myMethod(String str) {
  if (str == null) {
    return ""
  }
  // ... rest of the method
}

assert myMethod(null) == "" // Passes
assert myMethod("hello") == "olleh" // Fails unexpectedly
```