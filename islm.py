import matplotlib.pyplot as plt
import numpy as np
import sys
import sympy
from sympy.parsing.sympy_parser import parse_expr

type = sys.argv[1]
Y, r = sympy.symbols('Y,r')
c0 = float(sys.argv[2]) #120
c1 = float(sys.argv[3]) #0.5
T = float(sys.argv[4]) #40
I = sys.argv[5] #"100-10*r"
G = float(sys.argv[6]) #50
M = float(sys.argv[7]) #600
P = float(sys.argv[8]) #2
MP = sys.argv[9] #"Y-20*r"

finalY = "Y-({}+{}*(Y-{})+{}+{})".format(c0, c1, T, I, G)
finalY2 = "({}/{}-({}))".format(M, P, MP)
IS_expr = parse_expr(finalY, local_dict={'Y': Y, 'r': r}, evaluate=False)
LM_expr = parse_expr(finalY2, local_dict={'Y': Y, 'r': r}, evaluate=False)
Yaxis = np.arange(0, 700)/10
Xaxis = []
Xaxis2 = []
for y in Yaxis:
    Xaxis += sympy.solve(IS_expr.subs(r, y), Y)
    Xaxis2 += sympy.solve(LM_expr.subs(r, y), Y)


IS_expr2 = sympy.solve(IS_expr, Y)[0]
LM_expr2 = sympy.solve(LM_expr, Y)[0]
ponto_equilibrio = sympy.solve(IS_expr2 - (LM_expr2), r)[0]
Yequilibrio = sympy.solve(LM_expr.subs(r, ponto_equilibrio), Y)[0]
threshold1 = Xaxis.index(min(Xaxis, key=lambda x: abs(x - Xaxis2[0])))
threshold2 = Xaxis2.index(min(Xaxis2, key=lambda x: abs(x - Xaxis[0])))
plt.figure()
plt.plot(Xaxis[:threshold1], Yaxis[:threshold1], label="IS")
plt.plot(Xaxis2[:threshold2], Yaxis[:threshold2], label="LM")
plt.scatter([Yequilibrio], [ponto_equilibrio], color="black", label=str(Yequilibrio)[:6]+", "+str(ponto_equilibrio)[:3] + "%", zorder=3)
plt.xlabel("PIB real")
plt.ylabel("Taxa de juros")
if type == "0":
    plt.legend()
    plt.show()
if type == "1":
    Xaxis11 = []
    for y in Yaxis:
        Xaxis11 += [(sympy.solve(IS_expr.subs(r, y), Y)[0])+(threshold1/2)]
    threshold = Xaxis11.index(min(Xaxis11, key=lambda x: abs(x - Xaxis[0])))
    plt.plot(Xaxis11[threshold:], Yaxis[threshold:], label="IS2")
    plt.legend()
    plt.show()
if type == "2":
    Xaxis11 = []
    for y in Yaxis:
        Xaxis11 += [(sympy.solve(IS_expr.subs(r, y), Y)[0]) - (threshold1 / 2)]
    threshold = Xaxis11.index(min(Xaxis11, key=lambda x: abs(x - Xaxis2[0])))
    plt.plot(Xaxis11[:threshold], Yaxis[:threshold], label="IS2")
    plt.legend()
    plt.show()

if type == "3":
    Xaxis22 = []
    for y in Yaxis:
        Xaxis22 += [(sympy.solve(LM_expr.subs(r, y), Y)[0]) + (threshold1 / 2)]
    threshold = Xaxis22.index(min(Xaxis22, key=lambda x: abs(x - Xaxis[0])))
    plt.plot(Xaxis22[:threshold], Yaxis[:threshold], label="LM2")
    plt.legend()
    plt.show()
if type == "4":
    Xaxis22 = []
    for y in Yaxis:
        Xaxis22 += [(sympy.solve(LM_expr.subs(r, y), Y)[0]) - (threshold1 / 2)]
    threshold = Xaxis22.index(min(Xaxis22, key=lambda x: abs(x - Xaxis[0])))
    plt.plot(Xaxis22[:threshold], Yaxis[:threshold], label="LM2")
    plt.legend()
    plt.show()



