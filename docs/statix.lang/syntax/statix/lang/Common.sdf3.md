---
title: Common.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/lang/Common_1_8" title="Multi-file references" data-urls="../Core.sdf3/#statix/lang/Common_5_3 line 5; ../Deprecated.sdf3/#statix/lang/Common_5_3 line 5; ../NoParse.sdf3/#statix/lang/Common_5_3 line 5; ../PreCompiled.sdf3/#statix/lang/Common_5_3 line 5; ../Sugar.sdf3/#statix/lang/Common_5_3 line 5; ../Type.sdf3/#statix/lang/Common_7_3 line 7; ../../../StatixLang.sdf3/#statix/lang/Common_6_3 line 6; ../../cli/CLI.sdf3/#statix/lang/Common_6_3 line 6; ../../test/Result.sdf3/#statix/lang/Common_8_3 line 8; ../../test/Test.sdf3/#statix/lang/Common_6_3 line 6">statix/lang/Common</button>

<span class="keyword">lexical syntax</span>

  <a href="../Core.sdf3/#INT_340_13" id="INT_5_3" title="Referenced at ../Core.sdf3 line 340">INT</a> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

  <button class="modal-open" id="ID_7_3" title="Multi-file references" data-urls="#ID_21_3 line 21; ../Core.sdf3/#ID_146_19 line 146, 175">ID</button>     = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <button class="modal-open" id="UCID_8_3" title="Multi-file references" data-urls="#UCID_22_3 line 22; ../Core.sdf3/#UCID_238_17 line 238">UCID</button>   = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]    [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <button class="modal-open" id="LCID_9_3" title="Multi-file references" data-urls="#LCID_23_3 line 23; ../Core.sdf3/#LCID_83_18 line 83; ../PreCompiled.sdf3/#LCID_53_14 line 53, 54">LCID</button>   = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]    [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <button class="modal-open" id="VARID_10_3" title="Multi-file references" data-urls="#VARID_24_3 line 24; ../Core.sdf3/#VARID_337_13 line 337">VARID</button>  = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]* [\']*

  <span class="layout">// more liberal ID to accept most Stratego sort and op identifiers</span>
  <button class="modal-open" id="STRID_13_3" title="Multi-file references" data-urls="#STRID_26_3 line 26; ../Core.sdf3/#STRID_73_7 line 73, 321, 325">STRID</button> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']*
<span class="layout">//STRID = [a-z] [a-zA-Z0-9\_\-\']* // leads to ambiguities with COp</span>

  <a href="#FileId_17_14" id="FileId_16_3" title="Referenced at line 17, 28">FileId</a>   = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\.\~\']+
  <a href="#ModuleId_29_3" id="ModuleId_17_3" title="Referenced at line 29">ModuleId</a> = <a href="#FileId_16_3" id="FileId_17_14" title="Defined at line 16">FileId</a> (<span class="cons_Lit">"/"</span> <a href="#FileId_16_3" id="FileId_17_26" title="Defined at line 16">FileId</a>)*

<span class="keyword">lexical restrictions</span>

  <a href="#ID_7_3" id="ID_21_3" title="Defined at line 7">ID</a>    -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#UCID_8_3" id="UCID_22_3" title="Defined at line 8">UCID</a>  -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#LCID_9_3" id="LCID_23_3" title="Defined at line 9">LCID</a>  -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#VARID_10_3" id="VARID_24_3" title="Defined at line 10">VARID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

  <a href="#STRID_13_3" id="STRID_26_3" title="Defined at line 13">STRID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

  <a href="#FileId_16_3" id="FileId_28_3" title="Defined at line 16">FileId</a>   -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\.\~\']
  <a href="#ModuleId_17_3" id="ModuleId_29_3" title="Defined at line 17">ModuleId</a> -/- [\/]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
