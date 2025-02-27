[#ftl]
[@l.page title=" - upravit turnaj"]
    <h1>Upravit turnaji</h1>
    <div>
        <h2>Založit turnaj</h2>
        <form method="post" action="/">
            <div class="formInput">
                <label for="tournamentName">Název turnaje *</label>
                <input type="text" name="tournamentName" value=${tournament.tournamentName} required>
            </div>
            <div class="formInput">
                <label for="tournamentOrganizer">Pořadatel *</label>
                <input type="text" name="tournamentOrganizer" value=${tournament.tournamentOrganizer} required>
            </div>
            <div class="formInput">
                <label for="tournamentDate">Datum turnaje</label>
                <input type="date" name="tournamentDate" value=${tournament.tournamentDate}>
            </div>
            <div class="formInput">
                <label for="tournamentType">Typ turnaje *</label>
                <select name="tournamentType" required>
                    <option value="pokemon">Pokémon</option>
                </select>
            </div>
            <div class="formInput">
                <label for="tournamentRounds">Počet kol *</label>
                <input type="number" min="1" max="10" name="tournamentRounds"
                       value=${tournament.tournamentRounds} required>
            </div>
            <div>
                <button type="submit">Pokračovat</button>
            </div>
        </form>
    </div>
[/@l.page]