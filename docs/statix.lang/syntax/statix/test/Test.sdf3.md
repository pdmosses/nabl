---
title: Test.sdf3
---

# `Test.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/test/Test.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/test/Test.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/test/Test.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../../StatixLang.sdf3#statix/test/Test_163_179" id="statix/test/Test_7_23" title="Referenced at ../../../StatixLang.sdf3 line 12">statix/test/Test</a>

<span class="keyword">imports</span>

  <a href="../../lang/Layout.sdf3#statix/lang/Layout_7_25" id="statix/lang/Layout_36_54" title="Defined at ../../lang/Layout.sdf3 line 1">statix/lang/Layout</a>
  <a href="../../lang/Common.sdf3#statix/lang/Common_7_25" id="statix/lang/Common_57_75" title="Defined at ../../lang/Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../../lang/Core.sdf3#statix/lang/Core_7_23" id="statix/lang/Core_78_94" title="Defined at ../../lang/Core.sdf3 line 1">statix/lang/Core</a>
  <a href="../../lang/Sugar.sdf3#statix/lang/Sugar_7_24" id="statix/lang/Sugar_97_114" title="Defined at ../../lang/Sugar.sdf3 line 1">statix/lang/Sugar</a>
  <a href="../../lang/Deprecated.sdf3#statix/lang/Deprecated_7_29" id="statix/lang/Deprecated_117_139" title="Defined at ../../lang/Deprecated.sdf3 line 1">statix/lang/Deprecated</a>
 
<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

<span class="keyword">context-free start-symbols</span>
  
  <a href="#Test_254_258" id="Test_225_229" title="Defined at line 21">Test</a>

<span class="keyword">context-free syntax</span>

  <a href="#Test_225_229" id="Test_254_258" title="Referenced at line 17; ../../../StatixLang.sdf3 line 29">Test</a>.<span class="cons_Constructor"><span id="Test_259_263" title="Not referenced locally, nor via imports">Test</span></span> = &lt;
    <span class="cons_String">resolve</span>
      &lt;<a href="../../lang/Core.sdf3#Constraint_1391_1401" id="Constraint_287_297" title="Defined at ../../lang/Core.sdf3 line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>&gt;

    &lt;{<a href="../../lang/Core.sdf3#Section_425_432" id="Section_306_313" title="Defined at ../../lang/Core.sdf3 line 24, 31, 37">Section</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt;

</code></pre></td></tr></tbody></table></div>