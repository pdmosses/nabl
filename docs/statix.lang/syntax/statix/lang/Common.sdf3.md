---
title: Common.sdf3
---

# `Common.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/Common.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/Common.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/Common.sdf3 "The source file on GitHub"

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
27
28
29
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../test/Test.sdf3#statix/lang/Common_57_75" id="statix/lang/Common_7_25" title="Referenced at ../../test/Test.sdf3 line 6">statix/lang/Common</a>

<span class="keyword">lexical syntax</span>

  <a href="../Core.sdf3#INT_7957_7960" id="INT_45_48" title="Referenced at ../Core.sdf3 line 340">INT</a> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

  <a href="#ID_474_476" id="ID_61_63" title="Referenced at line 21; ../Core.sdf3 line 175">ID</a>     = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <a href="#UCID_502_506" id="UCID_96_100" title="Referenced at line 22; ../Core.sdf3 line 238">UCID</a>   = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]    [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <a href="#LCID_530_534" id="LCID_131_135" title="Referenced at line 23; ../Core.sdf3 line 83; ../PreCompiled.sdf3 line 54">LCID</a>   = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]    [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <a href="#VARID_558_563" id="VARID_166_171" title="Referenced at line 24; ../Core.sdf3 line 337">VARID</a>  = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]* [\']*

  <span class="layout">// more liberal ID to accept most Stratego sort and op identifiers</span>
  <a href="#STRID_587_592" id="STRID_277_282" title="Referenced at line 26; ../Core.sdf3 line 325">STRID</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']*
<span class="layout">//STRID = [a-z] [a-zA-Z0-9\_\-\']* // leads to ambiguities with COp</span>

  <a href="#FileId_618_624" id="FileId_381_387" title="Referenced at line 28">FileId</a>   = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\.\~\']+
  <a href="#ModuleId_655_663" id="ModuleId_417_425" title="Referenced at line 29">ModuleId</a> = <a href="#FileId_381_387" id="FileId_428_434" title="Defined at line 16">FileId</a> (<span class="cons_Lit">"/"</span> <a href="#FileId_381_387" id="FileId_440_446" title="Defined at line 16">FileId</a>)*

<span class="keyword">lexical restrictions</span>

  <a href="#ID_61_63" id="ID_474_476" title="Defined at line 7">ID</a>    -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#UCID_96_100" id="UCID_502_506" title="Defined at line 8">UCID</a>  -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#LCID_131_135" id="LCID_530_534" title="Defined at line 9">LCID</a>  -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#VARID_166_171" id="VARID_558_563" title="Defined at line 10">VARID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

  <a href="#STRID_277_282" id="STRID_587_592" title="Defined at line 13">STRID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

  <a href="#FileId_381_387" id="FileId_618_624" title="Defined at line 16">FileId</a>   -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\.\~\']
  <a href="#ModuleId_417_425" id="ModuleId_655_663" title="Defined at line 17">ModuleId</a> -/- [\/]

</code></pre></td></tr></tbody></table></div>