CREATE INDEX IF NOT EXISTS LOCAL_CATEGORY_MEMBER_IDX_ARTICLE_ID ON CATEGORY_MEMBERS(ARTICLE_ID, LANG_ID);
CREATE INDEX IF NOT EXISTS LOCAL_CATEGORY_MEMBER_IDX_CATEGORY_ID ON CATEGORY_MEMBERS(CATEGORY_ID, LANG_ID)
