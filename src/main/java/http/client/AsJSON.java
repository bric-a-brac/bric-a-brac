package http.client;

import com.google.gson.Gson;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public class AsJSON<T> extends AbstractContentHandler<T>
	{
	protected static final Gson GSON = new Gson();

	private final Class<T> classOfT;

	@WorkInProgress
	public AsJSON(final Class<T> classOfT)
		{
		super();

		this.classOfT = notNull(classOfT);
		}

	@Override
	@WorkInProgress
	public T get()
		{
		return GSON.fromJson("json", classOfT);
		}
	}
