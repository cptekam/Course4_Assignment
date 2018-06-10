package com.upgrad.ImageHoster.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Photo")
public class ProfilePhoto implements Serializable{
    // This is the base64 based encoding of the default ProfilePicture
    final static String defaultAvatarBase64 =
            "iVBORw0KGgoAAAANSUhEUgAAAQAAAAEACAYAAABccqhmAAAayklEQVR4Ae2d2XMUR57Hv313qyV0AwLMjY/xxQ7jtcee2fA4xhG7D/O4/9887sbGvOzG2DvrY70Gm8HGYwawjW2wjREIHehA6ru7auObrRYSElJ3HVId34qALlVXZmd+fpnfvDMTfzxv29AlAiIQSwLJWMZakRYBETAEJABKCCIQYwISgBgbX1EXAQmA0oAIxJiABCDGxlfURUACoDQgAjEmIAGIsfEVdRGQACgNiECMCUgAYmx8RV0EJABKAyIQYwISgBgbX1EXAQmA0oAIxJiABCDGxlfURUACoDQgAjEmIAGIsfEVdRGQACgNiECMCUgAYmx8RV0EJABKAyIQYwISgBgbX1EXAQmA0oAIxJiABCDGxlfURUACoDQgAjEmIAGIsfEVdRGQACgNiECMCUgAYmx8RV0EJABKAyIQYwISgBgbX1EXAQmA0oAIxJiABCDGxlfURUACoDQgAjEmIAGIsfEVdRGQACgNiECMCUgAYmx8RV0EJABKAyIQYwISgBgbX1EXAQmA0oAIxJiABCDGxlfURUACoDQgAjEmIAGIsfEVdRGQACgNiECMCUgAYmx8RV0EJABKAyIQYwISgBgbX1EXAQmA0oAIxJiABCDGxlfURUACoDQgAjEmIAGIsfEVdRGQACgNiECMCUgAYmx8RV0E0kIQbQKJBGD+MZq8X/3cMtY2YPOL1U+bn+bBlm/rYQQISAAiYMROFDqZPZkALBtotYDllQaWSw2slJpYLjVRrrZQb1hoNK21zJ1KJpBKJZDNJNGXT2GgmEZ/MY2BYgb9xQxSKaDjp0ShQzsanxKAkNuRmT6ZbJfy5YqFqZkK7s1UMDtfw4OlBpot22TeRCLRrgmYKsBqTWBd3DsFfSeD27ZtRCSdSmB0MIPxkRwO7S9gYn8BfYWkEQ/LUg1hHcJQ3ib+eF6VvLBZzmR6ZvwUMDdfx093Srg1WcLcYsOU5ClW9ZMJk/G9iBtrE7Zlo2VqFTbGhjI4daSI408VMTaSBYVAYuAF6d33QwKw+8wd/yIzPqvjlYqFHydXcPW7h1hcbsBU4ZPtEt6x5z04ZJHRoiBYNob6M3jxzD6cONpvagZsdqhI6QHmHr8qAdhjA3Tz852Mv7jUwNVvl/D9zyVTtc+kdi/TPymczOyNlg02Fc4cLeKlZwYxNJgx/Q8SgidRC85zCUBwbLEpJCbjJ4GHK0387foCvv25ZKr17LBbbcpvcrNXD9iH0Gq1+w2ePtqHcy+MYF9/Gi31E+yVSbr6XQlAV5h2/yVW9RsNG19cn8fV75fBdj0zfhguCgH7C146M2CEIJNJmBpBGMIetzBKAAJmcZb66TTw/Y8r+PjyAzQtG6zqh/EyTYNkAv/0q1GcOdGPZlP9A0GzowQgQBZhqV+tWvjg4jQmp6tmXJ6CEOaL/QD1poUj+/N469cHUMgnVRsIkEElAAExBkv923fL+ODiLCzbNj37AQmaJ8HgiAHnIvz+tXEcO9JnagOeeCxPXBHQWgBX+Nw7ZgnPiTyXry7g3fPTxkMO60XtYpwYq3cvTOOzK/Nrk5eiFs+wxUczAffQYsz8rCK/d+E+fpqqIJeJth4zvozjlzeW8GCpjrffOGhmJ2q4cO8SYbRT3N5x3fGXWcizt/xPf5nEnelq5DP/eiBcc8A+DsadDCJY4Vkf3UDfSwD2wDys8lfrFv79nTtYLjfNJJo9CMae/iQnDjHuZFCtWaZJsKcBiumPSwB22fDM/OVKC3/6n7tmVV4U2/vdImXcuTKRLMiEbHTtLgEh30XebAPXahb+88N7qNWZ4KPX2dcrTjKoNVptJjXL9An06ofed05AAuCcXU8uOx1+f/5oyqzJj3PJ/zg4suA+Be98PGU6RclK1+4QkADsDmczu+/9T+5jYXX13i79bGh+hiLA/Qve++S+YRWagIc8oBKAXTAgJ/lwnJ9Dfez80rU1AU55vj1VMazITJf/BCQAPjNOJYG7U1VcurYYq6E+p1g5T4CsJqcqIDtd/hIQYh/5si3L4b73Ls4gnxXqblGT1fsXZw079Qd0S83Ze0qVzrh15Yol2IXLs2YDTiXkrpCZl8iKm5Ze+HxWtYDusTl6UwLgCNvOjpj5f5os49ZkWe3+nXFteoN9Jbfulg1DNQU24fHsgQTAM5SPPGI3X9MCPr48h2xaiB+R6e2O7D7+Ys7sKtSbS73dLQGlzm5J9fBeKg1c+WpBbdgemG31qulDqVm48vWChga3AuTBMwmABxDXe8FEWy5bZsVbJq0hv/VsnNyT4d++WUKprFmCTvjt5EYCsBOhHr/nrj5ffj2vKa09ctvudYoqmZKtLm8JSAA85MmEWqlauHpzWR1/HnJlh+C1m8uGLRnr8o6ABMA7lmbI6vq3S0hrkY+HVNteken1bxc1LOgxWQmAh0AbLeD6zYeR28/PQ0SOveJaAdYCyFiXdwQkAB6x5Fr2n++WUGuos8ojpBu8YdWfeweQsfYN2IDG1R8SAFf4HjlmAv3m1sPQ7uH/KCbBveNiITJWP4B3NpIAeMCSCbJUbuHebE2bfHjA80lecPMQMl4ptSQCT4LU43MJQI/AtnqdfX537pXB8/F0+UuAjCenytpI1CPMEgAPQLJNeuvOCjTr1wOYO3hBxj9Mqh9gB0xdfy0B6BrV1i+y+l+p2phdqCOh4b+tIXn4lIxn5muGufoC3IOVALhkyEQ4v1Rr9/679EvOdybAeUAcaVl4WFM/wM64dnxDArAjou1foADMzFXV+bc9Jk+/ZWfg9FxVAuABVQmAS4gUgPtzNWirP5cge3BO1lOzEoAekD3xVQnAE9F09wWrpLMLrI5qknp3xNy/RdYz83Vz2Kh73+LtgwTAhf2Z50sVS7P/XDB04pTcuWXYipYIO8G3wY0EYAOO3v8oV5rasaZ3bK5dtCyOvjRd+xN3DyQALlIASyIKgDnOxoU/cuqAgG0b9mp5OWC3zokEYB2MXm/Z6i9VOC1V7f9e2bl9n8wNe7cexdy9BMBNAjCHfbag3ig3EB26FXuH4DY6kwBs5NHzX7W6pfzfMzX3DljnIntd7ghIANzxQ6ulJUAuETp2TvZqfDnGZxxKAFzwY+KzbAmAC4SOnYq9Y3QbHEoANuDo/Y+kOgB7h+aBC8qu0LsHKQFwwZCJUNtTuQDo0in3CVT9yx1ECYA7fkhrEwCXBJ07T+nQQOfwVl1KAFwizGWTmgfkkqET5+x6yeeUfJ2wW+9GBNfT6PG+nQhTqob2yM2L11n1z+dSEl+XMCUALgH296VhayTAJcXenZM52etyR0AC4IIf830hn9ZmIC4YOnXKTUHyeYqvUx/kjgQkAC7SARNffzGt46pcMHTqlJuCkL0EwCnBtjsJgDt+yGSAfcUMLJVELkl275yZfqCYRjbTvRu9uTUBCcDWXLp+alvAwdEcbClA18zcvmhZNibG8iB7Xe4ISADc8TMl//7RHLQkwCXIHpyT9YHxvGpdPTB70qsSgCeR6fI5q6P7x/Jdvq3XvCIwPpJT+98DmBIAlxApAIMDGQz0aUzaJcqunJv2f1/KMOe9LncEJADu+BnXPBDo6MECWuoH8IDm9l6QMVnrEKbtOXX7rQSgW1LbvMd8f+JIUQKwDSOvvqIAHD9SVPvfI6ASAA9AWhYwPlZAX17NAA9wPtELVvnJeP9YAWSuyz0BCYB7hsYHjkmfOtKnWoBHPLfyhqX/ycN9Gv/fCo7DZxIAh+Aed9ZqAc+eHERD44GPo/Hsb7J97tQgyFqXNwQkAN5wNENSI8MZHBrLaZswj5iu94Zbr5EtGav3fz0Zd/cSAHf8NrhmwvyH54bQaGp8agMYD/4g07PPDSnze8ByvRcSgPU0XN6zY+ro4T4MmCXCLj2T8zUCFFYyPXa4T51/a1S8uZEAeMNxzRcm1tdeGkG9qW7qNSgub8jy1ZdGVPq75LiVcwnAVlRcPGMt4OSxIgb71VZ1gXHNKedYDPVncOpYUaX/GhXvbiQA3rFc84m1gN/8clS1gDUizm94DPhvzo2q9HeOcFuXEoBt8Tj70vQFHCrgxKE+nRzkDKFxxXF/MnxqQhN/XGDc1qkEYFs8zr9stoA3zo0hwb3rNSjQM0gi4wnAZEiWuvwhIAHwh6vJ9MW+FN44qw5BJ4jrDQuvnx0BGUpAnRDszo0EoDtOjt7ijLVnTg3g2EQBTc0Q7JohD/08drCAZ08NaNZf19ScvSgBcMata1fsD3jr1wfMCUIqyXbGRkapVAJvvX5Avf4743L9hgTANcLtPWCCzqQT+MObB1FtaG7A9rRgGP3hdxOGmQRzJ1ruv5cAuGe4ow+sBYwNZ/H2a+MSgW1o1RoW3n513LAiM13+E5AA+M/Y/AJ7ss+c6Mc/Pj8EJnRdGwmQySvPD+HMyX71+m9E4+tfEgBf8W70vNkEzr0wjBdODYC93LraBMjixdP7DBsy0rV7BCQAu8fa/BJrAr/51RiePd6vmgBgGJDFG+dGVfLvclrkz0kA9gA6ReDN18bxwukBVOvxrQkw7qwNkYUm++xBQgSg41X3hjsaTeC3r4yhL5/GpWsLyGWTSOxRWHb7ZznLr1a38OqLwzj34hAajd0OgX6vQ0AC0CGxB59M+L98YQj7iml8+PkcUslE5Le75uo+zvHniMjpE/3K/HuQ7tb/pARgPY09uGen1+nj/RgazOK/z0+jUmshzaNvI3hxNmQhl8I///aAGepTh9/eG1l9AHtvA9P+HRnK4l//5QiOT/SZfoEorR9iXNjeZ9wYR8ZVbf4AJDwuuPrjec23CoYpuPoNSKeB735YwUefz5lghb020FkD8eYrY3iaY/xNaHFPUBKcOgEDZAm0Mwb7BdgkeOpQEZ9+MYtvb5eQTSeQDNlZWDzCu9608cyxIl4/N45cNqH2frCSmwmNagABNAqDxNpAKgVMz9Vw8csHmJqrIZtJBr6TkJ18nNgzMZbDr8+O4sB4zqzoUz0zmAlNAhBMu6yFKpmEGR6cvF/Bpb/PY26pjkwqeDUClvg8uGNsMItXXx7BkYMFsO2vOf1rpgzkjQQgkGbZHCgjBAng3v0KrtxYwuRMxeyYk04mTG1hswv/n7BUb1o2bNvGkf0FnH12EIeY8W1lfP/pe/MLGgb0hqPvvnRK0okDBRyZKGBpuYmbt5fx1c1lrFTaQ4cUiSTbDj5ePKGHYWHnXn8hhbOn9+H0sQEMDqTRsqANPHxk74fXqgH4QXUX/GQ+Z4ZPJYHZ+QZ+vlvC7akyph7UTJOBk4rMOwnnNQRTktss4duTd1ilnxjN4dhEH44eLmJ8JGMyPQWB7+gKHwEJQPhstinEHTHgF/WGjZm5Kmbnq5hbqGPhYcPUENgxx/dM/YCi8JgvJv8ys6+ORrDDkSX80EAG48NZjI/msX80j2y27VKZ/jGAIf1TTYCQGm59sE0JvbpzLucNHD7YbiYww3NfQp6rV6+3UKq0UK210GhYaLYssOOOF4cY06kkMpkk8rkUioUUstmU2ZWHIxH0v/NPJ/OuJx/+ewlA+G24IQadjLr+Ibcky6TT6O9Lr1YB1j7WXlurwTOzrz6lX5quu4YokjcSgEiadWOkmJF5mY9O7t74iv6KKQGtBYip4RVtESABCYDSgQjEmIAEIMbGV9RFQAKgNCACMSYgAYix8RV1EZAAKA2IQIwJSABibHxFXQQkAEoDIhBjAhKAGBtfURcBCYDSgAjEmIAEIMbGV9RFQAKgNCACMSagxUAhNz6X/Hauzn17zX/76fp7Pln3esfZps8N64XWrQ7kaqLOd50FRnS8/n6TZ3oQaAISgECbpx04s5HHas5du7eBBtf6Nyy0WrZZ51+pPlrvz7P3qvWWOYOP+wE0m5bZtJPvclsv2+zi097tx/i5bgch7imQSSfNCUVcSpzNJpHPJs0eAdwohHsGFPIp85lKtfcS4HkG9MeIwapQ8F7iEOwEJgEIkH06mZt5nffcr4M771SrLSytNLC80sDiMj+bWCk3zTFilbpltuFmNNqlfXu3H7o3zzqf7T/bHnfe7TzrLBXu/L2aax8v7U2G5jvcF9Bue2UEIZtEIZdEsZDGQDGD4X1p9Bcz2NefQSGfNtubc/uyjiB0Pjs/p8+9IyAB2Dv2q3v2rebJBFCt2ZhfqGF+qYYHi3UsLDUwv9wwx2rxXBBu+LkmEqvbevHvXMZ9V86qTrRpdNTjiWw2vI1qzUKlZuHBUgO2XTEZ3dQybJiaxFB/GsP7MhgZzGJ0OIvhwRwGiinjO0WmIwj81LW7BCQAu8ibmThhdu5tV9/nF+uYnquaf/dma1guN81Gn8zo7W3A2xm+kHWfwf2MphEl/sAG4XgkEg9LTSyuNPDD3bLZhqxlt0WLG4weGMvhwGgeI8M5FPuSpsYjQfDTWhv9lgBs5OHpXyZj8ISfJFBrAHMLNUxNV3DnfgXT8zWTGRKrmZ2ZntXoKF7kkOqIw+rJxyzsp+aquDtbhWUtmjMOBoppHJ8o4NCBAsZGKAipdu3AajeHoshmr+OkXYE9tgDTOUtvXiulFqZmyvhxsmwSO0/I5QaczANhO+vPY0xbeseSv2XZ5h87IocHMjhxuA9HJvowPJRDJt3uE2G/iC5vCEgAPODYyfRMwOyg+2lyBbfulDBn2sTtGkCn/e7Bz8XGi3YnqG1OHxoopHB0og8nnyriwFihLQY6gch1WpAAuEDIkp7/SmULt24v4/vbK5hZqIOHcnB4LGQH+rog4b9Tiiu3MedRZBySZM3gzLEBTBzImx/XOQXObCAB6JGbac8mWVUFfrxTwje3HuLOTBU8o0+ZvkeYDl83YmDb5ryDQi6F50/14+kT+zA0mDbnIKiJ0D1YCUCXrFjSszNvfqmJG7eW8NWtZTMBh21Vtee7hOjDa51+A55VyFGFl54dxLHDRVMzU61gZ+ASgB0YMeOz1J+aqeLK14umtGfVnqX9o4GuHTzR17tCgHMPmk3bzFJ8+elBPH1yAIV80tQKKBS6NhOQAGxmYp4w4/OanKrgi68WzLBdRqV9G0rA/2dmZ42A05h/cXIAzz89iP5iSkKwhd0kAI9BYcbnv9uTZXx+bQFzS3WTkNiLrytcBDrNA4b6xTP7cPYXw8hlE0YIwhUT/0IrAVhly/zNBS0zc3WcvzyL6fk6OM9dPfn+Jb7d9Jk1ArYCXnl+CC8/N2Sab+zIjfslAQCQTgEr5Rb+euUBvr1dQj7LITyV+FHMHFwZmc0k8NtfjuHU8WLsmwWxFgBTuieAazeW8Nn1BVMqsHNPV7QJsGlQb1pm1ODN1/ZjsD+N5urx6tGO+ebYxVYAWOpztd37F2cw/7CObDqa8/A3m1xPOgQ47ZhDha+fHcEvzuxbW5XY+T4On7FbDMSaPTv5rn/3EJ9cmQfzvTJ/HJL65jiaGZtJ4MKXD/DjZAm/e22/WYDUilFtIFY1AGZ8tgE/+GQaP09XPFlHvzlZ6UkYCbA2wJWZb7++H8cOFdBohjEWvYc5NvVeVvm5/v7f/nwH92aryvy9p5VIu2BtgL0///XRfVy+tmAWG8WhNygWAsBlpD/8XMJ//OWumb6rjr5I52XHkWPzsC+XxOdfLeL9T2bMHmtRHwyKvABwbP/qjSX85dMZs4os6gZ1nPrlcI0At1i7NVnGu/83ZToJo5xmIi0AzPx/u76IC1/Om8y/ZmHdiMAOBDiNeGquhj9/dC/SIhBZAWC1/8pXi7h0bUGZf4fErq+3JsCVnrMLdbzz0b2N2x1u/Xoon0ZSAJj5v765jItXlflDmSoDFGiKAKeFv3dhGplMgALmUVAiJwCpFHBnqoL//XxOJb9HiSTu3rA58OO9Mj67smDWi0SJR6QEgJ01pXIL756fRt6DvfKjZGjFxR0Bdgxe5n4Q9ypmYxh3vgXHdeQE4INPp9cOzwgOZoUkCgQoAh9emkWtzklDUYgREBkB4ESf698tYepBzWzKGQ3zKBZBIsBMX29Y+OuVOXPcWZDC5jQskRAAGma51MKlqwua4ec0JchdVwTYKXjjpxWzb0QU9oqIhACw9L/09wfao6+rJKyX3BLg1nDcO4IdzmG/Qi8ALP0fLDbMzC1N8Q17cgxH+LkL9D1zpmM99DtGhV4AqMJs+0ehOhaO5K9QkgDPgfjm5hKSIa8FhFoA2BFbr9v47vaK2aZbSVMEdosAa5s3bpfMNOHd+k0/fifcApAE7t4vmxV+ERmV8cPG8tMnArZtm9Oeuc9EWK8QBx2m2n/7blmlf1hTX8jDzT0E7k5XQj0nINwCkAR+ul/RDr4hz0hhDT77nWYXamENvgl3aAWAVf5KzUap0gq1Aoc69cQ88NxCbHG5Gep+gNAKAAf9l1cakZqXHfP8FLrocwi6XG2Z3YRDF/jVAIdWAAi/VovR9q1hTWERD3ejFe5TR0MrAExXZifXiCcwRS/gBMKd/8O9GEhHPgc8cyh4gScQ6hqAxv4Dn74UwIATCLUABJytgicCgScgAQi8iRRAEfCPgATAP7byWQQCT0ACEHgTKYAi4B8BCYB/bOWzCASegAQg8CZSAEXAPwISAP/YymcRCDwBCUDgTaQAioB/BCQA/rGVzyIQeAISgMCbSAEUAf8ISAD8YyufRSDwBCQAgTeRAigC/hGQAPjHVj6LQOAJSAACbyIFUAT8IyAB8I+tfBaBwBOQAATeRAqgCPhHQALgH1v5LAKBJyABCLyJFEAR8I+ABMA/tvJZBAJPQAIQeBMpgCLgHwEJgH9s5bMIBJ6ABCDwJlIARcA/AhIA/9jKZxEIPAEJQOBNpACKgH8EJAD+sZXPIhB4AhKAwJtIARQB/whIAPxjK59FIPAEJACBN5ECKAL+EZAA+MdWPotA4AlIAAJvIgVQBPwjIAHwj618FoHAE5AABN5ECqAI+EdAAuAfW/ksAoEnIAEIvIkUQBHwj4AEwD+28lkEAk9AAhB4EymAIuAfAQmAf2zlswgEnoAEIPAmUgBFwD8CEgD/2MpnEQg8AQlA4E2kAIqAfwQkAP6xlc8iEHgCEoDAm0gBFAH/CEgA/GMrn0Ug8AQkAIE3kQIoAv4RkAD4x1Y+i0DgCUgAAm8iBVAE/CMgAfCPrXwWgcATkAAE3kQKoAj4R0AC4B9b+SwCgScgAQi8iRRAEfCPgATAP7byWQQCT+D/AR5Ju5gu9msXAAAAAElFTkSuQmCC";

    // These annotations auto-increments the id column for us whenever
    // a new ProfilePhoto is stored into the database
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Text is a Postgres specific column type that allows you to save
    // text based data that will be longer than 256 characters
    @Column(columnDefinition="TEXT")
    private String profileImageData; // base64 version of the profile image;

    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    private User user;


    public ProfilePhoto() {
        this.profileImageData = defaultAvatarBase64;
    }

    public ProfilePhoto(String photoImageData) {
        this.profileImageData = photoImageData;
    }

    public int getId() {
        return id;
    }

    public String getProfileImageData() {
        return profileImageData;
    }

    public void setprofileImageData(String imageData) {
        this.profileImageData = imageData;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
