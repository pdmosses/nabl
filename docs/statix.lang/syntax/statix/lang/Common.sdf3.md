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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/lang/Common_1_8" title="a definition with multiple references" data-urls="../Core.sdf3/#statix/lang/Common line 5_3; ../Deprecated.sdf3/#statix/lang/Common line 5_3; ../NoParse.sdf3/#statix/lang/Common line 5_3; ../PreCompiled.sdf3/#statix/lang/Common line 5_3; ../Schema.sdf3/#statix/lang/Common line 4_3; ../Sugar.sdf3/#statix/lang/Common line 5_3; ../Type.sdf3/#statix/lang/Common line 7_3; ../../../StatixLang.sdf3/#statix/lang/Common line 6_3; ../../cli/CLI.sdf3/#statix/lang/Common line 6_3; ../../test/Result.sdf3/#statix/lang/Common line 8_3; ../../test/Test.sdf3/#statix/lang/Common line 6_3">statix/lang/Common</button>

<span class="keyword">lexical syntax</span>

  <a href="../Core.sdf3/#INT_340_13" id="INT_5_3" title="a definition with a single reference">INT</a> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

  <button class="modal-open" id="ID_7_3" title="a definition with multiple references" data-urls="#ID line 21_3; ../Core.sdf3/#ID line 146_19, 175_16">ID</button>     = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <button class="modal-open" id="UCID_8_3" title="a definition with multiple references" data-urls="#UCID line 22_3; ../Core.sdf3/#UCID line 238_17">UCID</button>   = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]    [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <button class="modal-open" id="LCID_9_3" title="a definition with multiple references" data-urls="#LCID line 23_3; ../Core.sdf3/#LCID line 83_18; ../PreCompiled.sdf3/#LCID line 53_14, 54_14">LCID</button>   = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]    [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <button class="modal-open" id="VARID_10_3" title="a definition with multiple references" data-urls="#VARID line 24_3; ../Core.sdf3/#VARID line 337_13">VARID</button>  = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]* [\']*

  <span class="layout">// more liberal ID to accept most Stratego sort and op identifiers</span>
  <button class="modal-open" id="STRID_13_3" title="a definition with multiple references" data-urls="#STRID line 26_3; ../Core.sdf3/#STRID line 73_7, 321_12, 325_10">STRID</button> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']*
<span class="layout">//STRID = [a-z] [a-zA-Z0-9\_\-\']* // leads to ambiguities with COp</span>

  <button class="modal-open" id="FileId_16_3" title="a definition with multiple references" data-urls="#FileId line 17_14, 17_26, 28_3">FileId</button>   = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\.\~\']+
  <a href="#ModuleId_29_3" id="ModuleId_17_3" title="a definition with a single reference">ModuleId</a> = <a href="#FileId_16_3" id="FileId_17_14" title="a reference to a single-file definition">FileId</a> (<span class="cons_Lit">"/"</span> <a href="#FileId_16_3" id="FileId_17_26" title="a reference to a single-file definition">FileId</a>)*

<span class="keyword">lexical restrictions</span>

  <a href="#ID_7_3" id="ID_21_3" title="a reference to a single-file definition">ID</a>    -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#UCID_8_3" id="UCID_22_3" title="a reference to a single-file definition">UCID</a>  -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#LCID_9_3" id="LCID_23_3" title="a reference to a single-file definition">LCID</a>  -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']
  <a href="#VARID_10_3" id="VARID_24_3" title="a reference to a single-file definition">VARID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

  <a href="#STRID_13_3" id="STRID_26_3" title="a reference to a single-file definition">STRID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

  <a href="#FileId_16_3" id="FileId_28_3" title="a reference to a single-file definition">FileId</a>   -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\.\~\']
  <a href="#ModuleId_17_3" id="ModuleId_29_3" title="a reference to a single-file definition">ModuleId</a> -/- [\/]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
