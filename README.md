<p align="center"><img src="docs/blueprint_emkp_logo.png" alt="Blueprint Logo" height="100"></p>

---

This is a slightly modified version of [Blueprint](https://github.com/wordandahalf/Blueprint) - the simple, annotation-driven library for modifying 
Java byte-code at runtime - used for code injection in the [Equilinox Mod Kit](https://github.com/EquilinoxModKit/Equilinox-Mod-Kit) and 
[Equilinox Mod Loader](https://github.com/EquilinoxModKit/Equilinox-Mod-Loader).

---

#### What's different to the original Blueprint?
- Changed parameter `target` of annotation `@Blueprint` from `String` to `Class`.<br>
  Old usage: `@Blueprint(target = "mypackage.MyClass")`.<br>
  New usage: `@Blueprint(target = MyClass.class)`
- Introduced final fields for parameter `at` of annotation `@Inject`.<br>
  Old usage: `@Inject(target = "myMethod", at = @At(location = "HEAD"))`.<br>
  New usage: `@Inject(target = "myMethod", at = @At(location = At.Pos.HEAD))`
- Minor code and documentation improvements.

---

For examples and tutorials visit the official [Blueprint Wiki](https://github.com/wordandahalf/Blueprint/wiki).