package jo.hit.leksjon11.Oblig.Logikk;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 *
 * Ikke brukt
 */
public interface Komparatorer<E>
{
	/**
	 * Return resultatet av å sammenligne høyre og venstre side
	 * @param venstre venstre side
	 * @param høyre høyre side
	 * @return < 0 hvis venstre er mindre enn høyre,
	 * 		0 hvis lik
	 * 		> 0 hvis venstre er større enn høyre
	 */
	int compare(E venstre, E høyre) throws ClassCastException;

}
