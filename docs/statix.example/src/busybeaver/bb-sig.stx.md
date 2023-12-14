---
title: bb-sig.stx
hide:
  - toc
---

# `bb-sig.stx`

:simple-github: [pdmosses/nabl/statix.example/src/busybeaver/bb-sig.stx]

[pdmosses/nabl/statix.example/src/busybeaver/bb-sig.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/busybeaver/bb-sig.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="layout">// 3-state Busy Beaver Turing machine specification</span>
<span class="layout">// https://en.wikipedia.org/wiki/Turing_machine_examples#3-state_Busy_Beaver</span>

<span class="keyword">module</span> <button class="modal-open" id="busybeaver/bb-sig_4_8" title="Multi-file references" data-urls="../bb-rules.stx/#busybeaver/bb-sig_8_3 line 8; ../bb-test.stxtest/#busybeaver/bb-sig_10_3 line 10"><span class="token sort_Id">busybeaver/bb-sig</span></button>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="State_8_9" title="Multi-file references" data-urls="#State_9_12 line 9, 10, 11, 12; ../bb-rules.stx/#State_12_16 line 12"><span class="token sort_Id">State</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="A_9_5" title="Multi-file references" data-urls="../bb-rules.stx/#A_14_14 line 14, 17, 21; ../bb-test.stxtest/#A_6_14 line 6"><span class="token sort_Id">A</span></button>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_8_9" id="State_9_12" title="Defined at line 8"><span class="token sort_Id">State</span></a></span></span>
    <span class="cons_OpDecl"><a href="../bb-rules.stx/#B_15_16" id="B_10_5" title="Referenced at ../bb-rules.stx line 15, 20, 23, 24, 27"><span class="token sort_Id">B</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_8_9" id="State_10_12" title="Defined at line 8"><span class="token sort_Id">State</span></a></span></span>
    <span class="cons_OpDecl"><a href="../bb-rules.stx/#C_18_16" id="C_11_5" title="Referenced at ../bb-rules.stx line 18, 26, 29"><span class="token sort_Id">C</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_8_9" id="State_11_12" title="Defined at line 8"><span class="token sort_Id">State</span></a></span></span>
    <span class="cons_OpDecl"><a href="../bb-rules.stx/#HALT_30_16" id="HALT_12_5" title="Referenced at ../bb-rules.stx line 30, 32"><span class="token sort_Id">HALT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_8_9" id="State_12_12" title="Defined at line 8"><span class="token sort_Id">State</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Symbol_15_12" id="Symbol_14_9" title="Referenced at line 15, 16, 23"><span class="token sort_Id">Symbol</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="Zero_15_5" title="Multi-file references" data-urls="../bb-rules.stx/#Zero_14_26 line 14, 20, 26, 40, 44; ../bb-test.stxtest/#Zero_6_24 line 6"><span class="token sort_Id">Zero</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Symbol_14_9" id="Symbol_15_12" title="Defined at line 14"><span class="token sort_Id">Symbol</span></a></span></span>
    <span class="cons_OpDecl"><a href="../bb-rules.stx/#One_15_33" id="One_16_5" title="Referenced at ../bb-rules.stx line 15, 17, 18, 21, 23, 24, 27, 29, 30"><span class="token sort_Id">One</span></a>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Symbol_14_9" id="Symbol_16_12" title="Defined at line 14"><span class="token sort_Id">Symbol</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Move_18_9" title="Multi-file references" data-urls="#Move_19_9 line 19, 20, 21; ../bb-rules.stx/#Move_36_17 line 36"><span class="token sort_Id">Move</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../bb-rules.stx/#R_15_48" id="R_19_5" title="Referenced at ../bb-rules.stx line 15, 30, 38, 40"><span class="token sort_Id">R</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_18_9" id="Move_19_9" title="Defined at line 18"><span class="token sort_Id">Move</span></a></span></span>
    <span class="cons_OpDecl"><a href="../bb-rules.stx/#L_18_48" id="L_20_5" title="Referenced at ../bb-rules.stx line 18, 21, 24, 27, 42, 44"><span class="token sort_Id">L</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_18_9" id="Move_20_9" title="Defined at line 18"><span class="token sort_Id">Move</span></a></span></span>
    <span class="cons_OpDecl"><a href="../bb-rules.stx/#N_46_11" id="N_21_5" title="Referenced at ../bb-rules.stx line 46"><span class="token sort_Id">N</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_18_9" id="Move_21_9" title="Defined at line 18"><span class="token sort_Id">Move</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="../bb-rules.stx/#Tape_12_24" id="Tape_23_9" title="Referenced at ../bb-rules.stx line 12, 36"><span class="token sort_Id">Tape</span></a> <span class="operator">=</span> <span class="operator">(</span><span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Symbol_14_9" id="Symbol_23_22" title="Defined at line 14"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Symbol_14_9" id="Symbol_23_32" title="Defined at line 14"><span class="token sort_Id">Symbol</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Symbol_14_9" id="Symbol_23_46" title="Defined at line 14"><span class="token sort_Id">Symbol</span></a></span>))</span>
  
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
