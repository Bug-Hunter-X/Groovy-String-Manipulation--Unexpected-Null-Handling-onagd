```groovy
def myMethod(String str) {
  if (str == null || str.isEmpty()) {
    return ""
  }
  return str.reverse() // Or any other string operation
}

assert myMethod(null) == "" // Passes
assert myMethod("") == ""  // Passes
assert myMethod("hello") == "olleh" // Passes
```