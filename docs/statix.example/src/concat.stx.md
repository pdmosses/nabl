---
title: concat.stx
hide:
  - toc
---

# `concat.stx`

:simple-github: [pdmosses/nabl/statix.example/src/concat.stx]

[pdmosses/nabl/statix.example/src/concat.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/concat.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="token keyword">module</span> <span id="concat_7_13" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">concat</span></span>

<span class="token keyword">signature</span>
  <span class="token keyword">constraints</span>
    <a href="#concatF_109_116" id="concatF_43_50" title="Referenced at line 9, 10, 10"><span class="token sort_ConstraintId">concatF</span></a> : <span class="token sort_ConstraintId">list</span>(<span class="token sort_ConstraintId">string</span>) * <span class="token sort_ConstraintId">list</span>(<span class="token sort_ConstraintId">string</span>) -&gt; <span class="token sort_ConstraintId">list</span>(<span class="token sort_ConstraintId">string</span>)

<span class="token keyword">rules</span>
  
  <a href="#concatF_43_50" id="concatF_109_116" title="Defined at line 5"><span class="token sort_ConstraintId">concatF</span></a>([], <span class="cons_Var">ys</span>) = <span class="cons_Var"><span id="ys_127_129" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">ys</span></span></span>.
  <a href="#concatF_43_50" id="concatF_133_140" title="Defined at line 5"><span class="token sort_ConstraintId">concatF</span></a>([<span class="cons_Var"><span id="x_142_143" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>|<span class="cons_Var">xs</span>], <span class="cons_Var">ys</span>) = [<span class="cons_Var">x</span>|<a href="#concatF_43_50" id="concatF_158_165" title="Defined at line 5"><span class="token sort_ConstraintId">concatF</span></a>(<span class="cons_Var"><span id="xs_166_168" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">xs</span></span></span>, <span class="cons_Var"><span id="ys_170_172" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">ys</span></span></span>)].

<span class="token keyword">signature</span>
  <span class="token keyword">constraints</span>
    <a href="#concatP_270_277" id="concatP_205_212" title="Referenced at line 18, 19, 19"><span class="token sort_ConstraintId">concatP</span></a> : <span class="token sort_ConstraintId">list</span>(<span class="token sort_ConstraintId">string</span>) * <span class="token sort_ConstraintId">list</span>(<span class="token sort_ConstraintId">string</span>) * <span class="token sort_ConstraintId">list</span>(<span class="token sort_ConstraintId">string</span>)

<span class="token keyword">rules</span>
  
  <a href="#concatP_205_212" id="concatP_270_277" title="Defined at line 14"><span class="token sort_ConstraintId">concatP</span></a>([], <span class="cons_Var">ys</span>, <span class="cons_Var"><span id="ys_286_288" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">ys</span></span></span>).
  <a href="#concatP_205_212" id="concatP_293_300" title="Defined at line 14"><span class="token sort_ConstraintId">concatP</span></a>([<span class="cons_Var"><span id="x_302_303" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>|<span class="cons_Var"><a href="#xs_332_334" id="xs_304_306" title="Referenced at line 19"><span class="token sort_ConstraintId">xs</span></a></span>], <span class="cons_Var"><a href="#ys_336_338" id="ys_309_311" title="Referenced at line 19"><span class="token sort_ConstraintId">ys</span></a></span>, [<span class="cons_Var">x</span>|<span class="cons_Var"><a href="#zs_340_342" id="zs_316_318" title="Referenced at line 19"><span class="token sort_ConstraintId">zs</span></a></span>]) :- <a href="#concatP_205_212" id="concatP_324_331" title="Defined at line 14"><span class="token sort_ConstraintId">concatP</span></a>(<span class="cons_Var"><a href="#xs_304_306" id="xs_332_334" title="Defined at line 19"><span class="token sort_ConstraintId">xs</span></a></span>, <span class="cons_Var"><a href="#ys_309_311" id="ys_336_338" title="Defined at line 19"><span class="token sort_ConstraintId">ys</span></a></span>, <span class="cons_Var"><a href="#zs_316_318" id="zs_340_342" title="Defined at line 19"><span class="token sort_ConstraintId">zs</span></a></span>).

</code></pre></td></tr></tbody></table></div>