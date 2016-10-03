try {

assert !(new File(basedir, 'target/classes/MyClass.class')).exists()
assert !(new File(basedir, 'target/test-classes/MyTestClass.class')).exists()
assert (new File(basedir, 'm1/target/classes/MyClass.class')).exists()
assert (new File(basedir, 'm1/target/test-classes/MyTestClass.class')).exists()
assert (new File(basedir, 'm2/target/classes/MyClass.class')).exists()
assert (new File(basedir, 'm2/target/classes/MyExclusiveClass.class')).exists()
assert (new File(basedir, 'm2/target/test-classes/MyTestClass.class')).exists()
assert (new File(basedir, 'm2/target/test-classes/MyExclusiveTestClass.class')).exists()

return true

} catch(Throwable e) {
  e.printStackTrace()
  return false
}
