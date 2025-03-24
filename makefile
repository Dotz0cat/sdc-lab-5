lab6.pdf: lab6.ms
	eqn -T pdf lab6.ms | tbl | groff -ms -T pdf > lab6.pdf

lab5.pdf: lab5.ms
	eqn -T pdf lab5.ms | tbl | groff -ms -T pdf > lab5.pdf

.PHONEY: clean

clean:
	@rm lab5.pdf
	@rm lab6.pdf
